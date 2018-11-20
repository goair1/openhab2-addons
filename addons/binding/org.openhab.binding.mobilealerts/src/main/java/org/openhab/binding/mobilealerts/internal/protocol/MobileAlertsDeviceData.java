/**
 * Copyright (c) 2010-2018 by the respective copyright holders.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.openhab.binding.mobilealerts.internal.protocol;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Stefan Mueller - Initial contribution
 *
 */
public class MobileAlertsDeviceData {

    public String Name;
    public String Id;
    public String DeviceType;
    public Map<String, String> Properties = new HashMap<String, String>();

}
