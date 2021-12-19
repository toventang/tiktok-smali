package com.ss.android.ugc.aweme.music.presenter;

import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.music.api.MusicApi;
import com.ss.android.ugc.aweme.music.model.CollectedMusicList;
import com.ss.android.ugc.aweme.music.model.Music;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

public final class k extends a<Music, CollectedMusicList> {

    /* renamed from: a  reason: collision with root package name */
    public int f111591a = 0;

    static {
        Covode.recordClassIndex(71710);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<Music> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CollectedMusicList) this.mData).items;
    }

    public k() {
        CollectedMusicList collectedMusicList = new CollectedMusicList();
        collectedMusicList.items = new ArrayList();
        collectedMusicList.setHasMore(true);
        this.mData = collectedMusicList;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        if (this.mData == null || !((CollectedMusicList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        a(0, 12);
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        a(((CollectedMusicList) this.mData).cursor, 10);
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final /* synthetic */ void handleData(Object obj) {
        boolean z;
        CollectedMusicList collectedMusicList = (CollectedMusicList) obj;
        boolean z2 = false;
        if (collectedMusicList == null || b.a((Collection) collectedMusicList.items)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i2 = this.mListQueryType;
            if (i2 == 1) {
                this.mData = collectedMusicList;
            } else if (i2 == 4) {
                if (this.mData == null) {
                    this.mData = collectedMusicList;
                    return;
                }
                List<Music> list = ((CollectedMusicList) this.mData).items;
                List<Music> list2 = collectedMusicList.items;
                List<Music> list3 = ((CollectedMusicList) this.mData).items;
                ArrayList arrayList = new ArrayList();
                for (Music music : list2) {
                    arrayList.add(music);
                    for (Music music2 : list3) {
                        if (music.getMid().equals(music2.getMid())) {
                            arrayList.remove(music);
                        }
                    }
                }
                list.addAll(arrayList);
                ((CollectedMusicList) this.mData).cursor = collectedMusicList.cursor;
                CollectedMusicList collectedMusicList2 = (CollectedMusicList) this.mData;
                if (collectedMusicList.isHasMore() && ((CollectedMusicList) this.mData).isHasMore()) {
                    z2 = true;
                }
                collectedMusicList2.setHasMore(z2);
            }
        } else if (this.mData != null) {
            if (this.mListQueryType == 1) {
                this.mData = collectedMusicList;
            }
            ((CollectedMusicList) this.mData).setHasMore(false);
        }
    }

    private void a(final int i2, final int i3) {
        n.a().a(this.mHandler, new Callable() {
            /* class com.ss.android.ugc.aweme.music.presenter.k.AnonymousClass1 */

            static {
                Covode.recordClassIndex(71711);
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                int i2 = i2;
                int i3 = i3;
                int i4 = k.this.f111591a;
                if (CommerceMediaServiceImpl.f().b() || CommerceMediaServiceImpl.f().e()) {
                    return MusicApi.f111094a.fetchUserCollectedMusicList(i2, i3, "commerce", i4).get();
                }
                return MusicApi.f111094a.fetchUserCollectedMusicList(i2, i3, "", i4).get();
            }
        }, 0);
    }
}
