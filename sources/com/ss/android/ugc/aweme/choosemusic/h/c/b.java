package com.ss.android.ugc.aweme.choosemusic.h.c;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.choosemusic.api.SearchSugApi;
import com.ss.android.ugc.aweme.choosemusic.h.c.a;
import com.ss.android.ugc.aweme.choosemusic.model.ak;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.music.model.MusicSearchHistory;
import h.f.b.l;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;

public final class b extends c<com.ss.android.ugc.aweme.common.b<ak>, a.AbstractC1595a> {

    /* renamed from: a  reason: collision with root package name */
    public int f70553a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f70554b = new Handler(Looper.getMainLooper());

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.choosemusic.h.d.b f70555c = new com.ss.android.ugc.aweme.choosemusic.h.d.b();

    /* renamed from: d  reason: collision with root package name */
    public String f70556d;

    /* renamed from: e  reason: collision with root package name */
    public String f70557e;

    /* renamed from: f  reason: collision with root package name */
    public Runnable f70558f = new Runnable() {
        /* class com.ss.android.ugc.aweme.choosemusic.h.c.b.AnonymousClass2 */

        static {
            Covode.recordClassIndex(43515);
        }

        public final void run() {
            b bVar = b.this;
            bVar.a(bVar.f70556d, b.this.f70557e);
        }
    };

    static {
        Covode.recordClassIndex(43512);
    }

    public b() {
        a(new com.ss.android.ugc.aweme.common.b<ak>() {
            /* class com.ss.android.ugc.aweme.choosemusic.h.c.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(43513);
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean checkParams(Object... objArr) {
                if (objArr == null || objArr.length == 0 || TextUtils.isEmpty((String) objArr[0])) {
                    return false;
                }
                return true;
            }

            @Override // com.ss.android.ugc.aweme.common.b, com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                if (message.what != b.this.f70553a) {
                    this.mHandler.removeMessages(message.what);
                } else {
                    super.handleMsg(message);
                }
            }

            @Override // com.ss.android.ugc.aweme.common.b
            public final boolean sendRequest(final Object... objArr) {
                if (!super.sendRequest(objArr)) {
                    return false;
                }
                this.mIsLoading = false;
                b bVar = b.this;
                bVar.f70553a = (bVar.f70553a + 1) % 10;
                n.a().a(this.mHandler, new Callable() {
                    /* class com.ss.android.ugc.aweme.choosemusic.h.c.b.AnonymousClass1.AnonymousClass1 */

                    static {
                        Covode.recordClassIndex(43514);
                    }

                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        Object[] objArr = objArr;
                        String str = (String) objArr[0];
                        MusicSearchHistory[] musicSearchHistoryArr = null;
                        String str2 = objArr.length > 1 ? (String) objArr[1] : null;
                        SearchSugApi searchSugApi = SearchSugApi.a.f70377a;
                        com.ss.android.ugc.aweme.choosemusic.h.d.b bVar = b.this.f70555c;
                        List<MusicSearchHistory> list = bVar.f70564a;
                        if (list != null) {
                            Object[] array = list.toArray(new MusicSearchHistory[0]);
                            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                            musicSearchHistoryArr = (MusicSearchHistory[]) array;
                        }
                        if (!Arrays.equals(musicSearchHistoryArr, bVar.f70565b)) {
                            JSONArray jSONArray = new JSONArray();
                            if (musicSearchHistoryArr != null) {
                                for (MusicSearchHistory musicSearchHistory : musicSearchHistoryArr) {
                                    jSONArray.put(musicSearchHistory.keyword);
                                }
                            }
                            bVar.f70565b = musicSearchHistoryArr;
                            String encode = Uri.encode(jSONArray.toString());
                            l.b(encode, "");
                            bVar.f70566c = encode;
                        }
                        return searchSugApi.getSearchSugList(str, str2, bVar.f70566c).get();
                    }
                }, b.this.f70553a);
                return true;
            }
        });
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void c() {
        T t;
        if (this.f76396h != null) {
            t = this.f76396h.mData;
        } else {
            t = null;
        }
        if (this.f76397i == null) {
            return;
        }
        if (t != null) {
            ac.a.f91473a.a(t.f70635b, t.f70636c);
            ((a.AbstractC1595a) this.f76397i).a(t);
            return;
        }
        ((a.AbstractC1595a) this.f76397i).p();
    }

    @Override // com.ss.android.ugc.aweme.common.c, com.ss.android.ugc.aweme.common.o
    public final void a_(Exception exc) {
        if (this.f76397i != null) {
            ((a.AbstractC1595a) this.f76397i).p();
        }
    }
}
