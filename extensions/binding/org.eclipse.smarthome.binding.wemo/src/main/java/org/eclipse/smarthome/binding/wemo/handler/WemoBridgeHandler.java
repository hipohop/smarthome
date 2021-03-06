/**
 * Copyright (c) 2014,2017 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.binding.wemo.handler;

import static org.eclipse.smarthome.binding.wemo.WemoBindingConstants.*;

import java.util.Collections;
import java.util.Set;

import org.eclipse.smarthome.config.core.Configuration;
import org.eclipse.smarthome.core.thing.Bridge;
import org.eclipse.smarthome.core.thing.ChannelUID;
import org.eclipse.smarthome.core.thing.ThingStatus;
import org.eclipse.smarthome.core.thing.ThingTypeUID;
import org.eclipse.smarthome.core.thing.binding.BaseBridgeHandler;
import org.eclipse.smarthome.core.types.Command;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * {@link WemoBridgeHandler} is the handler for a wemo bridge and connects it to
 * the framework.
 *
 * @author Hans-Jörg Merk - Initial contribution
 */
public class WemoBridgeHandler extends BaseBridgeHandler {

    public final static Set<ThingTypeUID> SUPPORTED_THING_TYPES = Collections.singleton(THING_TYPE_BRIDGE);

    private Logger logger = LoggerFactory.getLogger(WemoBridgeHandler.class);

    public WemoBridgeHandler(Bridge bridge) {
        super(bridge);
        logger.debug("Creating a WemoBridgeHandler for thing '{}'", getThing().getUID());
    }

    @Override
    public void initialize() {
        logger.debug("Initializing WemoBridgeHandler");

        Configuration configuration = getConfig();

        if (configuration.get(UDN) != null) {
            logger.trace("Initializing WemoBridgeHandler for UDN '{}'", configuration.get(UDN));
            updateStatus(ThingStatus.ONLINE);
        } else {
            logger.debug("Cannot initalize WemoBridgeHandler. UDN not set.");
        }
    }

    @Override
    public void handleCommand(ChannelUID channelUID, Command command) {
        // Not needed, all commands are handled in the {@link WemoLightHandler}
    }

}
