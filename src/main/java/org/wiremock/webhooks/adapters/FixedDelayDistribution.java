/*
 * Copyright (C) 2021 Thomas Akehurst
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wiremock.webhooks.adapters;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.github.tomakehurst.wiremock.http.DelayDistribution;

public class FixedDelayDistribution implements DelayDistributionAdapter {

  private final long milliseconds;

  public FixedDelayDistribution(@JsonProperty("milliseconds") long milliseconds) {
    this.milliseconds = milliseconds;
  }

  public long getMilliseconds() {
    return milliseconds;
  }

  @Override
  public long sampleMillis() {
    return milliseconds;
  }
}