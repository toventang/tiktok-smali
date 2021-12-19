package com.ss.android.ugc.aweme.music.ui.c;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.music.api.MusicAwemeApi;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.OriginalMusicList;
import com.ss.android.ugc.aweme.utils.in;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class a extends com.ss.android.ugc.aweme.common.e.a<Music, OriginalMusicList> {
    static {
        Covode.recordClassIndex(71951);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((OriginalMusicList) this.mData).musicList;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((OriginalMusicList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 3) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        a((String) objArr[1], (String) objArr[2], 0);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        a((String) objArr[1], (String) objArr[2], ((OriginalMusicList) this.mData).cursor);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        OriginalMusicList originalMusicList = (OriginalMusicList) obj;
        boolean z2 = false;
        if (originalMusicList == null || b.a((Collection) originalMusicList.musicList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = originalMusicList;
            } else if (i2 == 4) {
                ((OriginalMusicList) this.mData).musicList.addAll(originalMusicList.musicList);
                ((OriginalMusicList) this.mData).cursor = originalMusicList.cursor;
                OriginalMusicList originalMusicList2 = (OriginalMusicList) this.mData;
                if (originalMusicList.hasMore && ((OriginalMusicList) this.mData).hasMore) {
                    z2 = true;
                }
                originalMusicList2.hasMore = z2;
            }
        } else if (this.mData != null) {
            ((OriginalMusicList) this.mData).hasMore = false;
        }
    }

    private void a(final String str, final String str2, final int i2) {
        if (!in.d()) {
            n.a().a(this.mHandler, new Callable() {
                /* class com.ss.android.ugc.aweme.music.ui.c.a.AnonymousClass1 */

                /* renamed from: d  reason: collision with root package name */
                final /* synthetic */ int f111946d = 10;

                static {
                    Covode.recordClassIndex(71952);
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return MusicAwemeApi.a(str, str2, i2, this.f111946d);
                }
            }, 0);
        }
    }
}
