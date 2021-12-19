package com.ss.android.ugc.aweme.music.ui;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ic;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class AIMusicDownloadPlayHelper extends MusicDownloadPlayHelper implements au {

    /* renamed from: a  reason: collision with root package name */
    private Toast f111762a;

    /* renamed from: b  reason: collision with root package name */
    private ArrayList<Integer> f111763b = new ArrayList<>();

    static {
        Covode.recordClassIndex(71866);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final void a(MusicModel musicModel) {
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper, com.ss.android.ugc.aweme.music.a
    public final void d() {
        Downloader instance = Downloader.getInstance(this.f111793c.i());
        if (!b.a((Collection) this.f111763b)) {
            Iterator<Integer> it = this.f111763b.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (next != null) {
                    instance.cancel(next.intValue());
                }
            }
        }
        super.d();
    }

    public AIMusicDownloadPlayHelper(m mVar) {
        super(mVar);
    }

    private static void a(Toast toast) {
        if (Build.VERSION.SDK_INT == 25) {
            ic.a(toast);
        }
        toast.show();
    }

    private void a(Context context, String str) {
        Toast toast = this.f111762a;
        if (toast != null) {
            toast.cancel();
        }
        Toast makeText = Toast.makeText(context, str, 0);
        this.f111762a = makeText;
        if (makeText != null) {
            makeText.setGravity(17, 0, 0);
            a(this.f111762a);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.music.ui.MusicDownloadPlayHelper
    public final boolean a(MusicModel musicModel, Context context) {
        if (musicModel == null) {
            return true;
        }
        if (!musicModel.isPlayUrlValid()) {
            a(context, context.getString(R.string.dcc));
            return false;
        } else if (musicModel.getMusicStatus() != 0) {
            return true;
        } else {
            String offlineDesc = musicModel.getOfflineDesc();
            if (TextUtils.isEmpty(offlineDesc)) {
                offlineDesc = context.getString(R.string.dcb);
            }
            a(context, offlineDesc);
            return false;
        }
    }
}
