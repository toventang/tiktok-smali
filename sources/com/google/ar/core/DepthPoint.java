package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import java.util.Collection;

public class DepthPoint extends TrackableBase {
    static {
        Covode.recordClassIndex(33016);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    DepthPoint(long j2, Session session) {
        super(j2, session);
    }
}
