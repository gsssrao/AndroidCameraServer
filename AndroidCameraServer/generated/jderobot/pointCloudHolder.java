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
// Generated from file `pointcloud.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class pointCloudHolder extends Ice.ObjectHolderBase<pointCloud>
{
    public
    pointCloudHolder()
    {
    }

    public
    pointCloudHolder(pointCloud value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        if(v == null || v instanceof pointCloud)
        {
            value = (pointCloud)v;
        }
        else
        {
            IceInternal.Ex.throwUOE(type(), v);
        }
    }

    public String
    type()
    {
        return _pointCloudDisp.ice_staticId();
    }
}
