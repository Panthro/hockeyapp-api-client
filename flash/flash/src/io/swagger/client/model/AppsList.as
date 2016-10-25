package io.swagger.client.model {

import io.swagger.common.ListWrapper;
import io.swagger.client.model.AppsApps;

    public class AppsList implements ListWrapper {
        // This declaration below of _Apps_obj_class is to force flash compiler to include this class
        private var _apps_obj_class: io.swagger.client.model.Apps = null;
        [XmlElements(name="apps", type="io.swagger.client.model.Apps")]
        public var apps: Array = new Array();

        public function getList(): Array{
            return apps;
        }

}

}
