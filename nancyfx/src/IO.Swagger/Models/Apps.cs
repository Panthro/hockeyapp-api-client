using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace IO.Swagger.api2.Models
{
    /// <summary>
    /// Apps
    /// </summary>
    public sealed class Apps:  IEquatable<Apps>
    { 
        /// <summary>
        /// Success
        /// </summary>
        public string Success { get; private set; }

        /// <summary>
        /// _Apps
        /// </summary>
        public List<AppsApps> _Apps { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Apps.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Apps()
        {
        }

        private Apps(string Success, List<AppsApps> _Apps)
        {
            
            this.Success = Success;
            
            this._Apps = _Apps;
            
        }

        /// <summary>
        /// Returns builder of Apps.
        /// </summary>
        /// <returns>AppsBuilder</returns>
        public static AppsBuilder Builder()
        {
            return new AppsBuilder();
        }

        /// <summary>
        /// Returns AppsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AppsBuilder</returns>
        public AppsBuilder With()
        {
            return Builder()
                .Success(Success)
                ._Apps(_Apps);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Apps other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Apps.
        /// </summary>
        /// <param name="left">Compared (Apps</param>
        /// <param name="right">Compared (Apps</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Apps left, Apps right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Apps.
        /// </summary>
        /// <param name="left">Compared (Apps</param>
        /// <param name="right">Compared (Apps</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Apps left, Apps right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Apps.
        /// </summary>
        public sealed class AppsBuilder
        {
            private string _Success;
            private List<AppsApps> __Apps;

            internal AppsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Apps.Success property.
            /// </summary>
            /// <param name="value">Success</param>
            public AppsBuilder Success(string value)
            {
                _Success = value;
                return this;
            }

            /// <summary>
            /// Sets value for Apps._Apps property.
            /// </summary>
            /// <param name="value">_Apps</param>
            public AppsBuilder _Apps(List<AppsApps> value)
            {
                __Apps = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Apps.
            /// </summary>
            /// <returns>Apps</returns>
            public Apps Build()
            {
                Validate();
                return new Apps(
                    Success: _Success,
                    _Apps: __Apps
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}
