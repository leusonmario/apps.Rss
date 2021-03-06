/**
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
package es.upm.fiware.rss.settlement;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

/**
 *
 * @author fdelavega
 */
@Component
@Scope("singleton")
public class ThreadPoolManager {
    private ExecutorService executorService;

    @PostConstruct
    public void init() {
        this.executorService = Executors.newCachedThreadPool();
    }

    @PreDestroy
    public void cleanUp() {
        this.executorService.shutdownNow();
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }
}
