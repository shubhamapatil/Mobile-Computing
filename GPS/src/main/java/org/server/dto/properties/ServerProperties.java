/*
 * Copyright 2017 Benjamin.C.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.server.dto.properties;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class ServerProperties {

    private String host;
    private int port;
    private String protocol;
    private int threads;
    private int backlog;
    private boolean messagingService;
    private int messageQueueSize;
    private int requestQueueSize;
    private boolean requestLookupService;
    private long requestLookupInterval;

    public String getServerAddress() {
        return this.getHost() + ":" + this.getPort() + " " + this.getProtocol();
    }

}
