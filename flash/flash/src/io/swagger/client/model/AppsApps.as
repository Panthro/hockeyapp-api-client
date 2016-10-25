package io.swagger.client.model {


    [XmlRootNode(name="AppsApps")]
    public class AppsApps {
                [XmlElement(name="title")]
        public var title: String = null;
                [XmlElement(name="bundle_identifier")]
        public var bundleIdentifier: String = null;
                [XmlElement(name="public_identifier")]
        public var publicIdentifier: String = null;
                [XmlElement(name="device_family")]
        public var deviceFamily: String = null;
                [XmlElement(name="minimum_os_version")]
        public var minimumOsVersion: String = null;
                [XmlElement(name="release_type")]
        public var releaseType: Number = NaN;
                [XmlElement(name="status")]
        public var status: Number = NaN;
                [XmlElement(name="platform")]
        public var platform: String = null;

    public function toString(): String {
        var str: String = "AppsApps: ";
        str += " (title: " + title + ")";
        str += " (bundleIdentifier: " + bundleIdentifier + ")";
        str += " (publicIdentifier: " + publicIdentifier + ")";
        str += " (deviceFamily: " + deviceFamily + ")";
        str += " (minimumOsVersion: " + minimumOsVersion + ")";
        str += " (releaseType: " + releaseType + ")";
        str += " (status: " + status + ")";
        str += " (platform: " + platform + ")";
        return str;
    }

}

}
