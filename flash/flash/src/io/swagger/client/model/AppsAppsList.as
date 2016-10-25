package io.swagger.client.model {

import io.swagger.common.ListWrapper;

    public class AppsAppsList implements ListWrapper {
        // This declaration below of _Apps_apps_obj_class is to force flash compiler to include this class
        private var _appsApps_obj_class: io.swagger.client.model.AppsApps = null;
        [XmlElements(name="appsApps", type="io.swagger.client.model.AppsApps")]
        public var appsApps: Array = new Array();

        public function getList(): Array{
            return appsApps;
        }

}

}
