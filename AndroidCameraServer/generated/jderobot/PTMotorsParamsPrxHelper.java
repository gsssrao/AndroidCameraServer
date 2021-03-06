// **********************************************************************
//
// Copyright (c) 2003-2013 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.5.1
//
// <auto-generated>
//
// Generated from file `ptmotors.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * PTMotorsParams a class that contains the motors parametres.
 **/
public final class PTMotorsParamsPrxHelper extends Ice.ObjectPrxHelperBase implements PTMotorsParamsPrx
{
    public static PTMotorsParamsPrx checkedCast(Ice.ObjectPrx __obj)
    {
        PTMotorsParamsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsParamsPrx)
            {
                __d = (PTMotorsParamsPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId()))
                {
                    PTMotorsParamsPrxHelper __h = new PTMotorsParamsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PTMotorsParamsPrx checkedCast(Ice.ObjectPrx __obj, java.util.Map<String, String> __ctx)
    {
        PTMotorsParamsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsParamsPrx)
            {
                __d = (PTMotorsParamsPrx)__obj;
            }
            else
            {
                if(__obj.ice_isA(ice_staticId(), __ctx))
                {
                    PTMotorsParamsPrxHelper __h = new PTMotorsParamsPrxHelper();
                    __h.__copyFrom(__obj);
                    __d = __h;
                }
            }
        }
        return __d;
    }

    public static PTMotorsParamsPrx checkedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PTMotorsParamsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId()))
                {
                    PTMotorsParamsPrxHelper __h = new PTMotorsParamsPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PTMotorsParamsPrx checkedCast(Ice.ObjectPrx __obj, String __facet, java.util.Map<String, String> __ctx)
    {
        PTMotorsParamsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            try
            {
                if(__bb.ice_isA(ice_staticId(), __ctx))
                {
                    PTMotorsParamsPrxHelper __h = new PTMotorsParamsPrxHelper();
                    __h.__copyFrom(__bb);
                    __d = __h;
                }
            }
            catch(Ice.FacetNotExistException ex)
            {
            }
        }
        return __d;
    }

    public static PTMotorsParamsPrx uncheckedCast(Ice.ObjectPrx __obj)
    {
        PTMotorsParamsPrx __d = null;
        if(__obj != null)
        {
            if(__obj instanceof PTMotorsParamsPrx)
            {
                __d = (PTMotorsParamsPrx)__obj;
            }
            else
            {
                PTMotorsParamsPrxHelper __h = new PTMotorsParamsPrxHelper();
                __h.__copyFrom(__obj);
                __d = __h;
            }
        }
        return __d;
    }

    public static PTMotorsParamsPrx uncheckedCast(Ice.ObjectPrx __obj, String __facet)
    {
        PTMotorsParamsPrx __d = null;
        if(__obj != null)
        {
            Ice.ObjectPrx __bb = __obj.ice_facet(__facet);
            PTMotorsParamsPrxHelper __h = new PTMotorsParamsPrxHelper();
            __h.__copyFrom(__bb);
            __d = __h;
        }
        return __d;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::PTMotorsParams"
    };

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected Ice._ObjectDelM __createDelegateM()
    {
        return new _PTMotorsParamsDelM();
    }

    protected Ice._ObjectDelD __createDelegateD()
    {
        return new _PTMotorsParamsDelD();
    }

    public static void __write(IceInternal.BasicStream __os, PTMotorsParamsPrx v)
    {
        __os.writeProxy(v);
    }

    public static PTMotorsParamsPrx __read(IceInternal.BasicStream __is)
    {
        Ice.ObjectPrx proxy = __is.readProxy();
        if(proxy != null)
        {
            PTMotorsParamsPrxHelper result = new PTMotorsParamsPrxHelper();
            result.__copyFrom(proxy);
            return result;
        }
        return null;
    }

    public static final long serialVersionUID = 0L;
}
