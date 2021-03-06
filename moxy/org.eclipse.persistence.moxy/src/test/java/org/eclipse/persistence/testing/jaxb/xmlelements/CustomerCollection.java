/*
 * Copyright (c) 1998, 2020 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Matt MacIvor - 2.4.1 - Initial Implementation
package org.eclipse.persistence.testing.jaxb.xmlelements;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CustomerCollection {
    @XmlElements({
        @XmlElement(name="address", type=Address.class),
        @XmlElement(name="address", type=Link.class)
    })
    public List<Object> address;

    public boolean equals(Object obj) {
        CustomerCollection cust = (CustomerCollection)obj;
        return address == cust.address || address.equals(cust.address);
    }
}
