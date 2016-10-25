package io.swagger.client.model {

import io.swagger.client.model.AppsApps;

    [XmlRootNode(name="Apps")]
    public class Apps {
                [XmlElement(name="success")]
        public var success: String = null;
                // This declaration below of _apps_obj_class is to force flash compiler to include this class
        private var _apps_obj_class: Array = null;
        [XmlElementWrapper(name="apps")]
        [XmlElements(name="apps", type="Array")]
                public var apps: Array = new Array();

    public function toString(): String {
        var str: String = "Apps: ";
        str += " (success: " + success + ")";
        str += " (apps: " + apps + ")";
        return str;
    }

}

}
