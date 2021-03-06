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
package org.eclipse.smarthome.core.thing;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.smarthome.core.common.registry.Provider;

/**
 * The {@link ThingProvider} is responsible for providing things.
 *
 * @author Oliver Libutzki - Initial contribution
 * @author Dennis Nobel - Changed interface to extend {@link Provider} interface
 */
@NonNullByDefault
public interface ThingProvider extends Provider<Thing> {

}
