/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tomitribe.chatterbox.xmpp.impl;

import org.tomitribe.chatterbox.xmpp.impl.inflow.XMPPActivationSpec;

import javax.resource.ResourceException;
import javax.resource.spi.endpoint.MessageEndpointFactory;

public class XMPPActivation {

    private XMPPResourceAdapter ra;

    private XMPPActivationSpec spec;

    private MessageEndpointFactory endpointFactory;

    public XMPPActivation() throws ResourceException {
        this(null, null, null);
    }

    public XMPPActivation(XMPPResourceAdapter ra,
                          MessageEndpointFactory endpointFactory,
                          XMPPActivationSpec spec) throws ResourceException {
        this.ra = ra;
        this.endpointFactory = endpointFactory;
        this.spec = spec;
    }

    public XMPPActivationSpec getActivationSpec() {
        return spec;
    }

    public MessageEndpointFactory getMessageEndpointFactory() {
        return endpointFactory;
    }

    public void start() throws ResourceException {

    }

    public void stop() {

    }


}
