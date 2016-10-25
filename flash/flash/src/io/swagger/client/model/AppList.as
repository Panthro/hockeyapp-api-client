package io.swagger.client.model {

import io.swagger.common.ListWrapper;

    public class AppList implements ListWrapper {
        // This declaration below of _App_obj_class is to force flash compiler to include this class
        private var _app_obj_class: io.swagger.client.model.App = null;
        [XmlElements(name="app", type="io.swagger.client.model.App")]
        public var app: Array = new Array();

        public function getList(): Array{
            return app;
        }

}

}
