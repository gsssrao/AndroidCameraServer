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
// Generated from file `_BodyMotorsOperationsNC.java'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

/**
 * Interface to the Humanoid Body Motors.
 **/
public interface _BodyMotorsOperationsNC
{
    BodyMotorsParam getBodyMotorsParam(MotorsName name, BodySide side);

    int setBodyMotorsData(MotorsName name, BodySide side, float angle, float speed);
}