package com.ss.android.ugc.aweme.music.presenter;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.watcher.c;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.base.o;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.i.d;
import com.ss.android.ugc.aweme.music.model.MusicAwemeList;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class g extends a<Aweme, MusicAwemeList> {

    /* renamed from: a  reason: collision with root package name */
    public boolean f111577a;

    /* renamed from: b  reason: collision with root package name */
    private int f111578b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f111579c;

    /* renamed from: d  reason: collision with root package name */
    private String f111580d;

    /* renamed from: e  reason: collision with root package name */
    private long f111581e;

    /* renamed from: f  reason: collision with root package name */
    private int f111582f;

    static {
        Covode.recordClassIndex(71705);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((MusicAwemeList) this.mData).items;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isDataEmpty() {
        if ((this.mData == null || !((MusicAwemeList) this.mData).isHasMore()) && b.a((Collection) getItems())) {
            return true;
        }
        return false;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((MusicAwemeList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.ss.android.ugc.aweme.common.e.a
    public final /* synthetic */ boolean deleteItem(Aweme aweme) {
        return m.a(getItems(), aweme, this.mNotifyListeners);
    }

    public final void a(List<Aweme> list) {
        setItems(new ArrayList(list));
        ((MusicAwemeList) this.mData).cursor = (long) list.size();
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new MusicAwemeList();
        }
        ((MusicAwemeList) this.mData).hasMore = 1;
        ((MusicAwemeList) this.mData).items = list;
    }

    private static void a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            String stackTraceString = Log.getStackTraceString(new Throwable());
            if (stackTraceString.length() > 1024) {
                stackTraceString = stackTraceString.substring(0, 1024);
            }
            jSONObject.put("error_stack", stackTraceString);
            jSONObject.put("music_id", str);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        o.a("music_id_has_space", jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        long j2;
        String str = (String) objArr[1];
        if (isDataEmpty()) {
            j2 = 0;
        } else {
            j2 = ((MusicAwemeList) this.mData).cursor;
        }
        a(str, j2, ((Integer) objArr[2]).intValue());
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        if (objArr.length >= 6) {
            a((String) objArr[1], 0, ((Integer) objArr[2]).intValue(), ((Boolean) objArr[5]).booleanValue());
        } else {
            a((String) objArr[1], 0, ((Integer) objArr[2]).intValue());
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        MusicAwemeList musicAwemeList = (MusicAwemeList) obj;
        if (this.f111577a && this.f111579c) {
            long j2 = this.f111581e;
            if (j2 == 0) {
                String str = this.f111580d;
                int i2 = this.f111582f;
                int i3 = this.f111578b;
                l.d(str, "");
                l.d(musicAwemeList, "");
                d.f111508b.a(str + '&' + j2 + '&' + i2 + '&' + i3, new d.a(musicAwemeList, System.currentTimeMillis()));
            }
        }
        ac.a.f91473a.a(musicAwemeList.getRequestId(), musicAwemeList.logPb);
        if (!b.a((Collection) musicAwemeList.items) || musicAwemeList.isHasMore()) {
            if (musicAwemeList.items != null) {
                int size = musicAwemeList.items.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Aweme a2 = AwemeService.b().a(musicAwemeList.items.get(i4));
                    RequestIdService.a().a(a2.getAid() + (this.f111578b + 4000), musicAwemeList.getRequestId(), i4);
                    musicAwemeList.items.set(i4, a2);
                }
            }
            int i5 = this.mListQueryType;
            if (i5 == 1) {
                this.mData = musicAwemeList;
            } else if (i5 == 4) {
                if (musicAwemeList.items != null) {
                    if (b.a((Collection) ((MusicAwemeList) this.mData).items)) {
                        ((MusicAwemeList) this.mData).items = musicAwemeList.items;
                    } else {
                        c.a(((MusicAwemeList) this.mData).items, musicAwemeList.items, i.f111590a);
                    }
                }
                ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
                ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore & ((MusicAwemeList) this.mData).hasMore;
            }
        } else {
            if (this.mData == null) {
                this.mData = new MusicAwemeList();
            }
            ((MusicAwemeList) this.mData).cursor = musicAwemeList.cursor;
            ((MusicAwemeList) this.mData).hasMore = musicAwemeList.hasMore;
        }
    }

    private void a(String str, long j2, int i2) {
        a(str, j2, i2, false);
    }

    private void a(String str, long j2, int i2, boolean z) {
        this.f111580d = str;
        this.f111581e = j2;
        this.f111582f = 20;
        this.f111578b = i2;
        if (!TextUtils.isEmpty(str) && str.endsWith(" ")) {
            a(str);
        }
        MusicAwemeList musicAwemeList = null;
        if (this.f111577a && j2 == 0 && !z) {
            musicAwemeList = d.a(str, j2, 20, i2);
            if (musicAwemeList != null) {
                c.a("md_hit_cache", System.currentTimeMillis() - d.b(str, j2, 20, i2));
            } else {
                c.a("md_hit_cache", -1);
            }
        }
        if (musicAwemeList != null) {
            this.f111579c = false;
            Message message = new Message();
            message.obj = musicAwemeList;
            new Handler().post(new h(this, message));
            return;
        }
        if (j2 == 0) {
            this.f111579c = true;
        }
        n.a().a(this.mHandler, new Callable(str, j2, 20, i2) {
            /* class com.ss.android.ugc.aweme.music.presenter.g.AnonymousClass1 */

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f111583a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ long f111584b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ int f111585c = 20;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f111586d;

            static {
                Covode.recordClassIndex(71706);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                String str2 = this.f111583a;
                long j2 = this.f111584b;
                int i2 = this.f111585c;
                int i3 = this.f111586d;
                if (i3 == 0) {
                    str = MusicAwemeApi.f111097b;
                } else {
                    str = MusicAwemeApi.f111098c;
                }
                MusicAwemeApi.MusicService musicService = MusicAwemeApi.f111096a;
                if (str2 != null) {
                    str2 = str2.trim();
                }
                return musicService.queryMusicAwemeList(str, str2, j2, i2, i3).get();
            }

            {
                this.f111583a = r3;
                this.f111584b = r4;
                this.f111586d = r7;
            }
        }, 0);
    }
}
