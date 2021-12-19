package com.google.ar.core;

import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public enum h {
    BASE_TRACKABLE(1095893248, Trackable.class),
    UNKNOWN_TO_JAVA(-1, null),
    PLANE(1095893249, Plane.class),
    POINT(1095893250, Point.class),
    AUGMENTED_IMAGE(1095893252, AugmentedImage.class),
    FACE(1095893253, AugmentedFace.class),
    DEPTH_POINT(1095893265, DepthPoint.class),
    INSTANT_PLACEMENT_POINT(1095893266, InstantPlacementPoint.class);
    

    /* renamed from: i  reason: collision with root package name */
    final int f53461i;

    /* renamed from: j  reason: collision with root package name */
    private final Class<?> f53462j;

    static {
        Covode.recordClassIndex(33103);
    }

    public static h a(Class<? extends Trackable> cls) {
        h[] values = values();
        for (h hVar : values) {
            Class<?> cls2 = hVar.f53462j;
            if (cls2 != null && cls2.equals(cls)) {
                return hVar;
            }
        }
        return UNKNOWN_TO_JAVA;
    }

    private h(int i2, Class cls) {
        this.f53461i = i2;
        this.f53462j = cls;
    }
}
