// **********************************************************************
//
// Copyright (c) 2003-2011 ZeroC, Inc. All rights reserved.
//
// This copy of Ice is licensed to you under the terms described in the
// ICE_LICENSE file included in this distribution.
//
// **********************************************************************
//
// Ice version 3.4.2
//
// <auto-generated>
//
// Generated from file `Pose3DMotorsHolder.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public final class Pose3DMotorsHolder extends Ice.ObjectHolderBase<Pose3DMotors>
{
    public
    Pose3DMotorsHolder()
    {
    }

    public
    Pose3DMotorsHolder(Pose3DMotors value)
    {
        this.value = value;
    }

    public void
    patch(Ice.Object v)
    {
        try
        {
            value = (Pose3DMotors)v;
        }
        catch(ClassCastException ex)
        {
            IceInternal.Ex.throwUOE(type(), v.ice_id());
        }
    }

    public String
    type()
    {
        return _Pose3DMotorsDisp.ice_staticId();
    }
}