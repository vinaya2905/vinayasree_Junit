package com.epam.TDD_DEMO;

public class RemoveAInStart {
	public String remove(String str) {
		int len=str.length();
		String res="";
		if(len>0 && str.charAt(0)!='A') res+=str.charAt(0);
		if(len>1)
		{
			if(str.charAt(1)!='A') res+=str.charAt(1);
		}
		if(len>2)
		{
			for(int i=2;i<len;i++) res+=str.charAt(i);
		}
		return res;
	}
}
