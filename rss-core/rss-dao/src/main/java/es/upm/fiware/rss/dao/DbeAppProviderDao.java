/**
 * Revenue Settlement and Sharing System GE
 * Copyright (C) 2011-2014, Javier Lucio - lucio@tid.es
 * Telefonica Investigacion y Desarrollo, S.A.
 *
 * Copyright (C) 2015 CoNWeT Lab., Universidad Politécnica de Madrid
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */


package es.upm.fiware.rss.dao;

import es.upm.fiware.rss.model.DbeAppProvider;
import java.util.List;

/**
 * 
 * 
 */
public interface DbeAppProviderDao extends GenericDao<DbeAppProvider, String> {

    public List<DbeAppProvider> getProvidersByAggregator(String aggregatorId);

    public DbeAppProvider getProvider(String aggregatorId, String providerId);
}
