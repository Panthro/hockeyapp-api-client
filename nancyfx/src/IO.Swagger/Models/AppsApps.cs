using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace IO.Swagger.api2.Models
{
    /// <summary>
    /// AppsApps
    /// </summary>
    public sealed class AppsApps:  IEquatable<AppsApps>
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
        /// DeviceFamily
        /// </summary>
        public string DeviceFamily { get; private set; }

        /// <summary>
        /// MinimumOsVersion
        /// </summary>
        public string MinimumOsVersion { get; private set; }

        /// <summary>
        /// ReleaseType
        /// </summary>
        public int? ReleaseType { get; private set; }

        /// <summary>
        /// Status
        /// </summary>
        public int? Status { get; private set; }

        /// <summary>
        /// Platform
        /// </summary>
        public PlatformEnum? Platform { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AppsApps.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AppsApps()
        {
        }

        private AppsApps(string Title, string BundleIdentifier, string PublicIdentifier, string DeviceFamily, string MinimumOsVersion, int? ReleaseType, int? Status, PlatformEnum? Platform)
        {
            
            this.Title = Title;
            
            this.BundleIdentifier = BundleIdentifier;
            
            this.PublicIdentifier = PublicIdentifier;
            
            this.DeviceFamily = DeviceFamily;
            
            this.MinimumOsVersion = MinimumOsVersion;
            
            this.ReleaseType = ReleaseType;
            
            this.Status = Status;
            
            this.Platform = Platform;
            
        }

        /// <summary>
        /// Returns builder of AppsApps.
        /// </summary>
        /// <returns>AppsAppsBuilder</returns>
        public static AppsAppsBuilder Builder()
        {
            return new AppsAppsBuilder();
        }

        /// <summary>
        /// Returns AppsAppsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AppsAppsBuilder</returns>
        public AppsAppsBuilder With()
        {
            return Builder()
                .Title(Title)
                .BundleIdentifier(BundleIdentifier)
                .PublicIdentifier(PublicIdentifier)
                .DeviceFamily(DeviceFamily)
                .MinimumOsVersion(MinimumOsVersion)
                .ReleaseType(ReleaseType)
                .Status(Status)
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

        public bool Equals(AppsApps other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AppsApps.
        /// </summary>
        /// <param name="left">Compared (AppsApps</param>
        /// <param name="right">Compared (AppsApps</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AppsApps left, AppsApps right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AppsApps.
        /// </summary>
        /// <param name="left">Compared (AppsApps</param>
        /// <param name="right">Compared (AppsApps</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AppsApps left, AppsApps right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AppsApps.
        /// </summary>
        public sealed class AppsAppsBuilder
        {
            private string _Title;
            private string _BundleIdentifier;
            private string _PublicIdentifier;
            private string _DeviceFamily;
            private string _MinimumOsVersion;
            private int? _ReleaseType;
            private int? _Status;
            private PlatformEnum? _Platform;

            internal AppsAppsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AppsApps.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public AppsAppsBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for AppsApps.BundleIdentifier property.
            /// </summary>
            /// <param name="value">BundleIdentifier</param>
            public AppsAppsBuilder BundleIdentifier(string value)
            {
                _BundleIdentifier = value;
                return this;
            }

            /// <summary>
            /// Sets value for AppsApps.PublicIdentifier property.
            /// </summary>
            /// <param name="value">PublicIdentifier</param>
            public AppsAppsBuilder PublicIdentifier(string value)
            {
                _PublicIdentifier = value;
                return this;
            }

            /// <summary>
            /// Sets value for AppsApps.DeviceFamily property.
            /// </summary>
            /// <param name="value">DeviceFamily</param>
            public AppsAppsBuilder DeviceFamily(string value)
            {
                _DeviceFamily = value;
                return this;
            }

            /// <summary>
            /// Sets value for AppsApps.MinimumOsVersion property.
            /// </summary>
            /// <param name="value">MinimumOsVersion</param>
            public AppsAppsBuilder MinimumOsVersion(string value)
            {
                _MinimumOsVersion = value;
                return this;
            }

            /// <summary>
            /// Sets value for AppsApps.ReleaseType property.
            /// </summary>
            /// <param name="value">ReleaseType</param>
            public AppsAppsBuilder ReleaseType(int? value)
            {
                _ReleaseType = value;
                return this;
            }

            /// <summary>
            /// Sets value for AppsApps.Status property.
            /// </summary>
            /// <param name="value">Status</param>
            public AppsAppsBuilder Status(int? value)
            {
                _Status = value;
                return this;
            }

            /// <summary>
            /// Sets value for AppsApps.Platform property.
            /// </summary>
            /// <param name="value">Platform</param>
            public AppsAppsBuilder Platform(PlatformEnum? value)
            {
                _Platform = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AppsApps.
            /// </summary>
            /// <returns>AppsApps</returns>
            public AppsApps Build()
            {
                Validate();
                return new AppsApps(
                    Title: _Title,
                    BundleIdentifier: _BundleIdentifier,
                    PublicIdentifier: _PublicIdentifier,
                    DeviceFamily: _DeviceFamily,
                    MinimumOsVersion: _MinimumOsVersion,
                    ReleaseType: _ReleaseType,
                    Status: _Status,
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
