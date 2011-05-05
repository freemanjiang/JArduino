/**
 * Licensed under the GNU LESSER GENERAL PUBLIC LICENSE, Version 3, 29 June 2007;
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 	http://www.gnu.org/licenses/lgpl-3.0.txt
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Authors: Franck Fleurey and Brice Morin
 * Company: SINTEF IKT, Oslo, Norway
 * Date: 2011
 */
package org.sintef.jarduino;

import java.util.HashMap;
import java.util.Map;

public enum EInterruptPin {
	PIN_2_INT0((byte)0),
	PIN_3_INT1((byte)1);

	private final byte value;
	
	private EInterruptPin(byte value){
		this.value = value;
	}
	
	public byte getValue(){
		return value;
	}
	
	private static final Map<Byte, EInterruptPin> map;
	
	static {
		map = new HashMap<Byte, EInterruptPin>();
		map.put((byte)0, EInterruptPin.PIN_2_INT0);
		map.put((byte)1, EInterruptPin.PIN_3_INT1);
	}
	
	public static EInterruptPin fromValue(byte b) {
		return map.get(b);
	}
	
}
