/**
 * Copyright (c) 2010 Yahoo! Inc. All rights reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License. See accompanying LICENSE file.
 */
package org.apache.oozie.workflow.lite;

import org.apache.oozie.util.ParamChecker;

import java.util.Arrays;

//TODO javadoc
public class ActionNodeDef extends NodeDef {

    ActionNodeDef() {
    }

    public ActionNodeDef(String name, String conf, Class<? extends ActionNodeHandler> actionHandlerClass, String onOk,
                         String onError) {
        super(name, ParamChecker.notNull(conf, "conf"), actionHandlerClass, Arrays.asList(onOk, onError));
    }

}
