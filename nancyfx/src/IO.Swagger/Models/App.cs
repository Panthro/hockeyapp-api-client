using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace IO.Swagger.api2.Models
{
    /// <summary>
    /// App
    /// </summary>
    public sealed class App:  IEquatable<App>
    { 
        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// BundleIdentifier
        /// </summary>
        public string BundleIdentifier { get; private set; }

        /// <summary>
        /// PublicIdentifier
        /// </summary>
        public string PublicIdentifier { get; private set; }

        /// <summary>
        /// ReleaseType
        /// </summary>
        public int? ReleaseType { get; private set; }

        /// <summary>
        /// Platform
        /// </summary>
        public PlatformEnum? Platform { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use App.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public App()
        {
        }

        private App(string Title, string BundleIdentifier, string PublicIdentifier, int? ReleaseType, PlatformEnum? Platform)
        {
            
            this.Title = Title;
            
            this.BundleIdentifier = BundleIdentifier;
            
            this.PublicIdentifier = PublicIdentifier;
            
            this.ReleaseType = ReleaseType;
            
            this.Platform = Platform;
            
        }

        /// <summary>
        /// Returns builder of App.
        /// </summary>
        /// <returns>AppBuilder</returns>
        public static AppBuilder Builder()
        {
            return new AppBuilder();
        }

        /// <summary>
        /// Returns AppBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AppBuilder</returns>
        public AppBuilder With()
        {
            return Builder()
                .Title(Title)
                .BundleIdentifier(BundleIdentifier)
                .PublicIdentifier(PublicIdentifier)
                .ReleaseType(ReleaseType)
                .Platform(Platform);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(App other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (App.
        /// </summary>
        /// <param name="left">Compared (App</param>
        /// <param name="right">Compared (App</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (App left, App right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (App.
        /// </summary>
        /// <param name="left">Compared (App</param>
        /// <param name="right">Compared (App</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (App left, App right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of App.
        /// </summary>
        public sealed class AppBuilder
        {
            private string _Title;
            private string _BundleIdentifier;
            private string _PublicIdentifier;
            private int? _ReleaseType;
            private PlatformEnum? _Platform;

            internal AppBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for App.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public AppBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for App.BundleIdentifier property.
            /// </summary>
            /// <param name="value">BundleIdentifier</param>
            public AppBuilder BundleIdentifier(string value)
            {
                _BundleIdentifier = value;
                return this;
            }

            /// <summary>
            /// Sets value for App.PublicIdentifier property.
            /// </summary>
            /// <param name="value">PublicIdentifier</param>
            public AppBuilder PublicIdentifier(string value)
            {
                _PublicIdentifier = value;
                return this;
            }

            /// <summary>
            /// Sets value for App.ReleaseType property.
            /// </summary>
            /// <param name="value">ReleaseType</param>
            public AppBuilder ReleaseType(int? value)
            {
                _ReleaseType = value;
                return this;
            }

            /// <summary>
            /// Sets value for App.Platform property.
            /// </summary>
            /// <param name="value">Platform</param>
            public AppBuilder Platform(PlatformEnum? value)
            {
                _Platform = value;
                return this;
            }


            /// <summary>
            /// Builds instance of App.
            /// </summary>
            /// <returns>App</returns>
            public App Build()
            {
                Validate();
                return new App(
                    Title: _Title,
                    BundleIdentifier: _BundleIdentifier,
                    PublicIdentifier: _PublicIdentifier,
                    ReleaseType: _ReleaseType,
                    Platform: _Platform
                );
            }

            private void Validate()
            { 
            }
        }

        
        public enum PlatformEnum { IOS, Android, MacOs, WindowsPhone, Custom };
    }
}
