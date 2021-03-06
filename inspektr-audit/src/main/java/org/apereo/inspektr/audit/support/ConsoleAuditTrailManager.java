/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apereo.inspektr.audit.support;

import org.apereo.inspektr.audit.AuditActionContext;
import org.apereo.inspektr.audit.AuditTrailManager;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * Simple <code>AuditTrailManager</code> that dumps auditable information to output stream.
 * <p>
 * Useful for testing.
 *
 * @author Dmitriy Kopylenko
 * @author Scott Battaglia
 * @version $Id: ConsoleAuditTrailManager.java,v 1.2 2007/06/12 15:18:43 dkopylen Exp $
 * @see AuditTrailManager
 * @since 1.0
 */
public class ConsoleAuditTrailManager extends AbstractStringAuditTrailManager {

    @Override
    public void record(final AuditActionContext auditActionContext) {
        System.out.println(toString(auditActionContext));
    }

    @Override
    public Set<AuditActionContext> getAuditRecordsSince(final LocalDate sinceDate) {
        return new HashSet<>();
    }
}
