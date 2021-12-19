package com.google.ar.core;

import com.bytedance.covode.number.Covode;
import java.util.Collection;

public interface Trackable {
    static {
        Covode.recordClassIndex(33046);
    }

    Anchor createAnchor(Pose pose);

    Collection<Anchor> getAnchors();

    TrackingState getTrackingState();
}
