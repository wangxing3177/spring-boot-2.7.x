/*
 * Copyright 2012-2022 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package smoketest.hazelcast4;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Country implements Serializable {

	private final String code;

	public Country(String code) {
		this.code = code;
	}

	public String getCode() {
		return this.code;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}

		Country country = (Country) o;

		return this.code.equals(country.code);
	}

	@Override
	public int hashCode() {
		return this.code.hashCode();
	}

}
