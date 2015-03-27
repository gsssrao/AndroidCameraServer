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
// Generated from file `_JointMotorDel.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package RoboCompJointMotor;

public interface _JointMotorDel extends Ice._ObjectDel
{
    void setPosition(MotorGoalPosition goal, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               HardwareFailedException,
               UnknownMotorException;

    void setVelocity(MotorGoalVelocity goal, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               HardwareFailedException,
               UnknownMotorException;

    void setSyncPosition(MotorGoalPosition[] listGoals, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               HardwareFailedException,
               UnknownMotorException;

    MotorParams getMotorParams(String motor, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               UnknownMotorException;

    MotorState getMotorState(String motor, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               UnknownMotorException;

    java.util.Map<java.lang.String, MotorState> getMotorStateMap(String[] mList, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               UnknownMotorException;

    void getAllMotorState(MotorStateMapHolder mstateMap, java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper,
               UnknownMotorException;

    MotorParams[] getAllMotorParams(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;

    BusParams getBusParams(java.util.Map<String, String> __ctx)
        throws IceInternal.LocalExceptionWrapper;
}