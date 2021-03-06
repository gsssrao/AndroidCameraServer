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
// Generated from file `wiimote.ice'
//
// Warning: do not edit this file.
//
// </auto-generated>
//

package jderobot;

public class InfraredData extends Ice.ObjectImpl
{
    public InfraredData()
    {
    }

    public InfraredData(int[] infrared1, int[] infrared2, int[] infrared3, int[] infrared4, int sourceDetected)
    {
        this.infrared1 = infrared1;
        this.infrared2 = infrared2;
        this.infrared3 = infrared3;
        this.infrared4 = infrared4;
        this.sourceDetected = sourceDetected;
    }

    private static class __F implements Ice.ObjectFactory
    {
        public Ice.Object create(String type)
        {
            assert(type.equals(ice_staticId()));
            return new InfraredData();
        }

        public void destroy()
        {
        }
    }
    private static Ice.ObjectFactory _factory = new __F();

    public static Ice.ObjectFactory
    ice_factory()
    {
        return _factory;
    }

    public static final String[] __ids =
    {
        "::Ice::Object",
        "::jderobot::InfraredData"
    };

    public boolean ice_isA(String s)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public boolean ice_isA(String s, Ice.Current __current)
    {
        return java.util.Arrays.binarySearch(__ids, s) >= 0;
    }

    public String[] ice_ids()
    {
        return __ids;
    }

    public String[] ice_ids(Ice.Current __current)
    {
        return __ids;
    }

    public String ice_id()
    {
        return __ids[1];
    }

    public String ice_id(Ice.Current __current)
    {
        return __ids[1];
    }

    public static String ice_staticId()
    {
        return __ids[1];
    }

    protected void __writeImpl(IceInternal.BasicStream __os)
    {
        __os.startWriteSlice(ice_staticId(), -1, true);
        IntSeqHelper.write(__os, infrared1);
        IntSeqHelper.write(__os, infrared2);
        IntSeqHelper.write(__os, infrared3);
        IntSeqHelper.write(__os, infrared4);
        __os.writeInt(sourceDetected);
        __os.endWriteSlice();
    }

    protected void __readImpl(IceInternal.BasicStream __is)
    {
        __is.startReadSlice();
        infrared1 = IntSeqHelper.read(__is);
        infrared2 = IntSeqHelper.read(__is);
        infrared3 = IntSeqHelper.read(__is);
        infrared4 = IntSeqHelper.read(__is);
        sourceDetected = __is.readInt();
        __is.endReadSlice();
    }

    public int[] infrared1;

    public int[] infrared2;

    public int[] infrared3;

    public int[] infrared4;

    public int sourceDetected;

    public static final long serialVersionUID = 8986539104587168823L;
}
