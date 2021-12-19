package com.ss.android.ugc.aweme.feed.assem.videoauthorinfo;

import android.app.Application;
import com.bytedance.assem.arch.viewModel.j;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.g;
import com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.login.b.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class VideoAuthorInfoVM extends FeedBaseViewModel<q> {
    static {
        Covode.recordClassIndex(58612);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final /* synthetic */ j f() {
        return new q();
    }

    private static boolean a(Aweme aweme) {
        if (aweme == null) {
            return true;
        }
        if ((!aweme.isCanPlay() || aweme.isDelete()) && !a.a(aweme)) {
            return false;
        }
        return true;
    }

    private static String a(String str) {
        String str2;
        try {
            Application a2 = g.a();
            Object[] objArr = new Object[1];
            if (str == null) {
                str2 = "";
            } else {
                str2 = str;
            }
            objArr[0] = str2;
            String string = a2.getString(R.string.bvy, objArr);
            l.b(string, "");
            return string;
        } catch (Throwable unused) {
            if (str == null) {
                str = "";
            }
            return str;
        }
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, java.lang.Object] */
    @Override // com.bytedance.ext_power_list.j
    public final /* synthetic */ VideoItemParams b(j jVar, VideoItemParams videoItemParams) {
        l.d(jVar, "");
        l.d(videoItemParams, "");
        return videoItemParams;
    }

    /* Return type fixed from 'com.bytedance.assem.arch.viewModel.j' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0057 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0184  */
    @Override // com.ss.android.ugc.aweme.feed.assem.base.FeedBaseViewModel
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.q a(com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.q r17, com.ss.android.ugc.aweme.feed.model.VideoItemParams r18) {
        /*
        // Method dump skipped, instructions count: 397
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.assem.videoauthorinfo.VideoAuthorInfoVM.a(com.bytedance.assem.arch.viewModel.j, com.ss.android.ugc.aweme.feed.model.VideoItemParams):com.bytedance.assem.arch.viewModel.j");
    }
}
