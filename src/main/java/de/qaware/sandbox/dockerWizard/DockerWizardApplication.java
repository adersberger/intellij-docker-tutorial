/*
 * Copyright (C) 2016 QAware GmbH
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package de.qaware.sandbox.dockerWizard;

import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class DockerWizardApplication extends Application<DockerWizardConfiguration> {

    public static void main(String[] args) throws Exception {
       new DockerWizardApplication().run(args);
    }

    @Override
    public void run(DockerWizardConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new HelloWorldResource());
    }
}
