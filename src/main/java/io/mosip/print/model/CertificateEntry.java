package io.mosip.print.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Arrays;

/**
 * Certificate Key Entry from SoftHsm
 * 
 * @author Urvil Joshi
 *
 * @param <C> Certificate Type
 * @param <P> PrivateKey Type
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CertificateEntry<C, P> {

	private C[] chain;

	private P privateKey;

	@Override
	public String toString() {
		return "CertificateEntry [chain=" + Arrays.toString(chain) + ", privateKey=" + privateKey + "]";
	}

}
