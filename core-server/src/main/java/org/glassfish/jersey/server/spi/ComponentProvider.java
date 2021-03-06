/*
 * Copyright (c) 2012, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package org.glassfish.jersey.server.spi;

/**
 * Component provider interface to allow custom management of 3rd party
 * components life-cycle and dependency injection.
 * <p />
 * An implementation (a component-provider) identifies itself by placing a provider-configuration
 * file (if not already present), {@code org.glassfish.jersey.server.spi.ComponentProvider}
 * in the resource directory <tt>META-INF/services</tt>, and adding the fully
 * qualified service-provider-class of the implementation in the file.
 *
 * Jersey will not even try to inject component provider instances with Jersey artifacts.
 * The SPI providers should be designed so that no dependency injection is needed at the bind time phase.

 * @author Jakub Podlesak
 */
public interface ComponentProvider extends org.glassfish.jersey.spi.ComponentProvider {

}
