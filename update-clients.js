#!/usr/bin/env node
var languages = require('./languages');
const exec = require('child_process').exec;

Promise.all(languages.map( (lang) => {
  return new Promise((resolve, reject) => {
    console.log(`Generating: ${lang}`)
    exec(`./generate_client.sh ${lang}`, (error, stdout, stderr) => {
        if (error) {
          reject(error);
        }else{
          resolve(lang);
        }
      });
  });
}))
.then((lang) => {
  console.log(`Generated: ${lang}`);
}).catch((error) => {
  console.error(`Error generating language ${error}`);
  process.exit(1);
})
