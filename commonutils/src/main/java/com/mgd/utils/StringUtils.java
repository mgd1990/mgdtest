package com.mgd.utils;

public class StringUtils
{

    public static void main(String[] args) {
        
    }
    /**
     *
     * @param  str
     * @return boolean
     */
    public static boolean isEmpty(String str)
    {
        if (null == str || str.length() == 0)
        {
            return true;
        }
        return false;
    }


}
