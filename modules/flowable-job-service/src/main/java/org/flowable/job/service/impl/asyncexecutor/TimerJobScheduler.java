/* Licensed under the Apache License, Version 2.0 (the "License");
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
package org.flowable.job.service.impl.asyncexecutor;

import org.flowable.job.service.impl.persistence.entity.JobEntity;
import org.flowable.job.service.impl.persistence.entity.TimerJobEntity;
import org.flowable.variable.api.delegate.VariableScope;

/**
 * @author Filip Hrisafov
 */
public interface TimerJobScheduler {

    /**
     * Re-schedule a timer job once it has finished with its execution.
     *
     * @param timerJob the job that was executed
     * @param variableScope the variable scope in which it was executed.
     */
    void rescheduleTimerJobAfterExecution(JobEntity timerJob, VariableScope variableScope);

    /**
     * Schedules a timer, meaning it will be inserted in the datastore.
     */
    void scheduleTimerJob(TimerJobEntity timerJob);

}
