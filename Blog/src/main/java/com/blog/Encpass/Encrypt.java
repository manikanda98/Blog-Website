package com.blog.Encpass;

import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;

public class Encrypt {

	public String Encpass(String s) {
		String pd = s;
		String ed = null;
		try {
			MessageDigest m1 = MessageDigest.getInstance("MD5");
			/*
			 * Use the MD5 update() function to add plain-text password bytes to the digest.
			 */
			m1.update(pd.getBytes());
			/* The hash value should be converted to bytes. */
			byte[] bt = m1.digest();
			/*
			 * Decimal bytes are contained in the bytes array. Changing the format to
			 * hexadecimal.
			 */
			StringBuilder str = new StringBuilder();
			for (int i = 0; i < bt.length; i++) {
				str.append(Integer.toString((bt[i] & 0xff) + 0x100, 16).substring(1));
			}
			ed = str.toString();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		/* Displaying the unencrypted and encrypted passwords. */
//System.out.println (" Original password: " + pd); 
//System.out.println("Encrypted password using MD5: " + ed); 
		return ed;
	}
}
