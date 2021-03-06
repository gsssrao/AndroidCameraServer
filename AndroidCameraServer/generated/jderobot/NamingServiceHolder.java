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
// Generated from file `namingService.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class NamingServiceHolder extends Ice.ObjectHolderBase<NamingService>
{
    public
    NamingServiceHolder()
    {
    }

    public
    NamingServiceHolder(NamingService value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof NamingService)
        {
            value = (NamingService)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _NamingServiceDisp.ice_staticId();
    }
}
