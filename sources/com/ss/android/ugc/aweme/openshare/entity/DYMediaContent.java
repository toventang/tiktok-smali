package com.ss.android.ugc.aweme.openshare.entity;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;

public class DYMediaContent {
    public a mMediaObject;

    static {
        Covode.recordClassIndex(73729);
    }

    public DYMediaContent() {
    }

    public final boolean checkArgs() {
        return this.mMediaObject.checkArgs();
    }

    public final int getType() {
        a aVar = this.mMediaObject;
        if (aVar == null) {
            return 0;
        }
        return aVar.type();
    }

    public DYMediaContent(a aVar) {
        this.mMediaObject = aVar;
    }

    public static class a {
        static {
            Covode.recordClassIndex(73730);
        }

        public static DYMediaContent a(Bundle bundle) {
            DYMediaContent dYMediaContent = new DYMediaContent();
            String string = bundle.getString("_dyobject_identifier_");
            if (string != null && string.length() > 0) {
                try {
                    dYMediaContent.mMediaObject = (a) Class.forName(string).newInstance();
                    dYMediaContent.mMediaObject.unserialize(bundle);
                    return dYMediaContent;
                } catch (Exception e2) {
                    e2.getMessage();
                }
            }
            return dYMediaContent;
        }
    }
}
