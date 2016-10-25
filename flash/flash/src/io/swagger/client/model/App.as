package io.swagger.client.model {


    [XmlRootNode(name="App")]
    public class App {
                [XmlElement(name="title")]
        public var title: String = null;
                [XmlElement(name="bundle_identifier")]
        public var bundleIdentifier: String = null;
                [XmlElement(name="public_identifier")]
        public var publicIdentifier: String = null;
                [XmlElement(name="release_type")]
        public var releaseType: Number = NaN;
                [XmlElement(name="platform")]
        public var platform: String = null;

    public function toString(): String {
        var str: String = "App: ";
        str += " (title: " + title + ")";
        str += " (bundleIdentifier: " + bundleIdentifier + ")";
        str += " (publicIdentifier: " + publicIdentifier + ")";
        str += " (releaseType: " + releaseType + ")";
        str += " (platform: " + platform + ")";
        return str;
    }

}

}
