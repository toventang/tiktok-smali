package com.ss.android.ugc.aweme.share.entity.base;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.openshare.entity.a;
import java.util.ArrayList;

public class TikTokImageObject implements a {
    public ArrayList<String> mImagePaths;

    static {
        Covode.recordClassIndex(81071);
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.a
    public boolean checkArgs() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.a
    public int type() {
        return 2;
    }

    public TikTokImageObject() {
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.a
    public void serialize(Bundle bundle) {
        bundle.putStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH", this.mImagePaths);
    }

    public TikTokImageObject(ArrayList<String> arrayList) {
        ArrayList<String> arrayList2 = new ArrayList<>();
        this.mImagePaths = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.ss.android.ugc.aweme.openshare.entity.a
    public void unserialize(Bundle bundle) {
        this.mImagePaths = bundle.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
    }
}
