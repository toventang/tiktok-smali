package com.ss.android.ugc.aweme.notification.model;

import android.os.Message;
import android.os.SystemClock;
import androidx.lifecycle.t;
import com.bytedance.common.utility.collection.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.mlcomponent_api.BuildConfig;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.e.a;
import com.ss.android.ugc.aweme.common.o;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notice.api.a;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MessageItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeCombineDatas;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeItems;
import com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse;
import com.ss.android.ugc.aweme.notice.repo.list.bean.g;
import com.ss.android.ugc.aweme.notification.ab.d;
import com.ss.android.ugc.aweme.notification.api.MusNotificationApiManager;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import h.a.af;
import h.a.n;
import h.f.b.l;
import h.j.e;
import h.j.h;
import h.q;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class MusNewNotificationModel extends a<MusNotice, MessageResponse> {
    private final List<NoticeItems> collapseNotices = new ArrayList();
    public String lastGroupApiLogId;
    public final t<NoticeCombineDatas> liveData = new t<>();
    private int mCurrentType = a.b.a();
    private final Map<Integer, List<MusNotice>> mDataMap = new LinkedHashMap();
    private boolean mHasMore;
    private long mLastReadTime;
    private long mMaxTime;
    private long mMinTime;
    public int mTotal;
    public final t<LiveNoticeMessageResponse> updateLiveData = new t<>();

    static {
        Covode.recordClassIndex(73162);
    }

    public static int com_ss_android_ugc_aweme_notification_model_MusNewNotificationModel_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final boolean isHasMore() {
        return this.mHasMore;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final List<MusNotice> getItems() {
        return getItemsFromGroup(this.mCurrentType);
    }

    public final void startFetchLive() {
        MusNotificationApiManager.f113215a.fetchLiveNotice("tiktok_message", 0, 3, 81).c(new MusNewNotificationModel$startFetchLive$1(this, SystemClock.elapsedRealtime()));
    }

    public final void setCurrentNoticeGroup(int i2) {
        this.collapseNotices.clear();
        this.mCurrentType = i2;
    }

    private final void sortByTime(List<MusNotice> list) {
        if (!b.a((Collection) list)) {
            n.a((List) list, (Comparator) MusNewNotificationModel$sortByTime$1.INSTANCE);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b
    public final boolean checkParams(Object... objArr) {
        l.d(objArr, "");
        if (objArr.length == 3) {
            return true;
        }
        return false;
    }

    public final List<MusNotice> getItemsFromGroup(int i2) {
        List<MusNotice> list = this.mDataMap.get(Integer.valueOf(i2));
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        this.mDataMap.put(Integer.valueOf(i2), arrayList);
        return arrayList;
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void loadMoreList(Object... objArr) {
        l.d(objArr, "");
        com.ss.android.ugc.aweme.notification.e.a.b.d();
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        if (d.f113118a) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new g(intValue, this.mMaxTime, this.mMinTime, 0, 0, 24, null));
            com.ss.android.ugc.aweme.base.n.a().a(this.mHandler, new MusNewNotificationModel$loadMoreList$1(arrayList), intValue);
        }
    }

    @Override // com.ss.android.ugc.aweme.common.e.a
    public final void refreshList(Object... objArr) {
        l.d(objArr, "");
        com.ss.android.ugc.aweme.notification.e.a.b.d();
        Object obj = objArr[1];
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) obj).intValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new g(intValue, 0, 0, 0, 0, 30, null));
        com.ss.android.ugc.aweme.base.n.a().a(this.mHandler, new MusNewNotificationModel$refreshList$1(this, intValue, arrayList), intValue);
    }

    private final void handleExtractLogId(Message message) {
        this.lastGroupApiLogId = null;
        Object obj = message.obj;
        if (obj != null) {
            try {
                this.lastGroupApiLogId = ((BaseResponse) obj).extra.logid;
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(r.a(th));
            }
            Object obj2 = message.obj;
            if (obj2 != null) {
                try {
                    Object rawResponse = ((com.ss.android.ugc.aweme.base.api.a.b.a) obj2).getRawResponse();
                    if (rawResponse != null) {
                        this.lastGroupApiLogId = ((BaseResponse) rawResponse).extra.logid;
                        q.m223constructorimpl(z.f158842a);
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
                } catch (Throwable th2) {
                    q.m223constructorimpl(r.a(th2));
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException");
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type com.ss.android.ugc.aweme.base.api.BaseResponse");
        }
    }

    private final void tryChangePositionForce(int i2) {
        List<MusNotice> itemsFromGroup;
        Object obj;
        if (i2 == a.b.a() && (itemsFromGroup = getItemsFromGroup(i2)) != null && !itemsFromGroup.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = e.a.a(itemsFromGroup.size() - 1, 0, -1).iterator();
            while (it.hasNext()) {
                int a2 = ((af) it).a();
                if (itemsFromGroup.get(a2).needForceInsert()) {
                    arrayList.add(itemsFromGroup.get(a2));
                    itemsFromGroup.remove(a2);
                }
            }
            if (arrayList.size() > 1) {
                n.a((List) arrayList, (Comparator) new MusNewNotificationModel$tryChangePositionForce$$inlined$sortBy$1());
            }
            Iterator it2 = h.a(0, arrayList.size()).iterator();
            while (it2.hasNext()) {
                MusNotice musNotice = (MusNotice) arrayList.get(((af) it2).a());
                int min = Math.min(musNotice.lowestPosition - 1, itemsFromGroup.size());
                Iterator it3 = h.a(0, min).iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it3.next();
                    int intValue = ((Number) obj).intValue();
                    if (itemsFromGroup.get(intValue).lowestPosition == 0 && itemsFromGroup.get(intValue).createTime < musNotice.createTime) {
                        break;
                    }
                }
                Integer num = (Integer) obj;
                if (num != null) {
                    min = num.intValue();
                }
                itemsFromGroup.add(min, musNotice);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.common.b, com.bytedance.common.utility.collection.WeakHandler.IHandler
    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message != null) {
            Object obj = message.obj;
            if (!(obj instanceof BaseResponse)) {
                obj = null;
            }
            j.a((BaseResponse) obj);
            handleExtractLogId(message);
            if (message.obj instanceof Exception) {
                com_ss_android_ugc_aweme_notification_model_MusNewNotificationModel_com_ss_android_ugc_aweme_lancet_LogLancet_e("Snow", "exception: ");
                Object obj2 = message.obj;
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                ((Exception) obj2).printStackTrace();
                if (this.mNotifyListeners != null) {
                    for (o oVar : this.mNotifyListeners) {
                        Object obj3 = message.obj;
                        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.Exception /* = java.lang.Exception */");
                        oVar.a_((Exception) obj3);
                    }
                }
                com.ss.android.ugc.aweme.notification.e.a.b.a(message.what, (String) null, message.obj.toString());
                return;
            }
            int i2 = message.what;
            Long l2 = com.ss.android.ugc.aweme.notification.e.a.b.f113351b;
            if (l2 != null) {
                com.ss.android.ugc.aweme.notification.e.a.b.a("notice_type_list_net", System.currentTimeMillis() - l2.longValue(), Integer.valueOf(i2));
            }
            com.ss.android.ugc.aweme.notification.e.a.b.f113351b = null;
            if (d.f113118a) {
                handleCombineResponse(message);
            }
            if (!(message.obj instanceof MessageResponse)) {
                if (this.mNotifyListeners != null) {
                    for (o oVar2 : this.mNotifyListeners) {
                        Object obj4 = message.obj;
                        if (!(obj4 instanceof Exception)) {
                            obj4 = null;
                        }
                        oVar2.a_((Exception) obj4);
                    }
                }
                int i3 = message.what;
                Object obj5 = message.obj;
                com.ss.android.ugc.aweme.notification.e.a.b.a(i3, (String) null, obj5 != null ? obj5.toString() : null);
            } else if (message.what == this.mCurrentType) {
                Object obj6 = message.obj;
                Objects.requireNonNull(obj6, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
                handleData((MessageResponse) obj6, message.what, true);
                if (this.mNotifyListeners != null) {
                    for (o oVar3 : this.mNotifyListeners) {
                        oVar3.c();
                    }
                }
            } else {
                Object obj7 = message.obj;
                Objects.requireNonNull(obj7, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse");
                handleData((MessageResponse) obj7, message.what, false);
            }
        }
    }

    private final void handleCombineResponse(Message message) {
        MusNotice musNotice;
        List<NoticeItems> notices;
        if (message != null && (message.obj instanceof NoticeListsResponse)) {
            Object obj = message.obj;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notice.repo.list.bean.NoticeListsResponse");
            NoticeListsResponse noticeListsResponse = (NoticeListsResponse) obj;
            List<NoticeItems> list = this.collapseNotices;
            ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(it.next().getGroup()));
            }
            List g2 = n.g((Collection) arrayList);
            List<NoticeItems> collapseNotices2 = noticeListsResponse.getCollapseNotices();
            if (collapseNotices2 != null) {
                ArrayList arrayList2 = new ArrayList();
                for (T t : collapseNotices2) {
                    if (!g2.contains(Integer.valueOf(t.getGroup()))) {
                        arrayList2.add(t);
                    }
                }
                ArrayList<NoticeItems> arrayList3 = arrayList2;
                this.collapseNotices.addAll(arrayList3);
                ArrayList arrayList4 = new ArrayList(n.a((Iterable) arrayList3, 10));
                for (NoticeItems noticeItems : arrayList3) {
                    arrayList4.add(Integer.valueOf(noticeItems.getGroup()));
                }
                g2.addAll(arrayList4);
            }
            int i2 = message.what;
            NoticeItems noticeItems2 = null;
            if (i2 == a.b.a()) {
                if (this.mListQueryType == 1 && (notices = noticeListsResponse.getNotices()) != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (T t2 : notices) {
                        if (t2.getGroup() != a.b.a()) {
                            arrayList5.add(t2);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList();
                    for (Object obj2 : arrayList5) {
                        if (!g2.contains(Integer.valueOf(((NoticeItems) obj2).getGroup()))) {
                            arrayList6.add(obj2);
                        }
                    }
                    this.collapseNotices.addAll(arrayList6);
                }
                List<NoticeItems> notices2 = noticeListsResponse.getNotices();
                if (notices2 != null) {
                    Iterator<T> it2 = notices2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        T next = it2.next();
                        if (next.getGroup() == message.what) {
                            noticeItems2 = next;
                            break;
                        }
                    }
                    noticeItems2 = noticeItems2;
                }
            } else if (i2 == 37) {
                ArrayList arrayList7 = new ArrayList();
                List<NoticeItems> notices3 = noticeListsResponse.getNotices();
                if (notices3 != null) {
                    for (T t3 : notices3) {
                        List<MusNotice> items = t3.getItems();
                        if (!(items == null || (musNotice = (MusNotice) n.h((List) items)) == null)) {
                            arrayList7.add(musNotice);
                            com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = musNotice.templateNotice;
                            if (eVar != null) {
                                eVar.f112855m = t3.getGroup();
                            }
                        }
                    }
                }
                noticeItems2 = new NoticeItems(arrayList7, false, 0, 0, 0, 0, message.what, 0, BuildConfig.VERSION_CODE, null);
            } else {
                List<NoticeItems> notices4 = noticeListsResponse.getNotices();
                if (notices4 != null) {
                    Iterator<T> it3 = notices4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        T next2 = it3.next();
                        if (next2.getGroup() == message.what) {
                            noticeItems2 = next2;
                            break;
                        }
                    }
                    noticeItems2 = noticeItems2;
                }
            }
            message.obj = new MessageResponse(new MessageItem(noticeItems2), noticeListsResponse.getLobPb());
        }
    }

    private final void handleCombineData(int i2, NoticeItems noticeItems, List<MusNotice> list) {
        MusNotice musNotice;
        MusNotice musNotice2;
        if (noticeItems == null || !noticeItems.getHasMore()) {
            for (T t : this.collapseNotices) {
                List<MusNotice> items = t.getItems();
                if (!(items == null || (musNotice = (MusNotice) n.h((List) items)) == null)) {
                    list.add(musNotice);
                    musNotice.noticeListType = t.getListType();
                    com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = musNotice.templateNotice;
                    if (eVar != null) {
                        eVar.f112855m = t.getGroup();
                    }
                }
            }
            this.collapseNotices.clear();
            return;
        }
        Iterator<NoticeItems> it = this.collapseNotices.iterator();
        while (it.hasNext()) {
            NoticeItems next = it.next();
            List<MusNotice> items2 = next.getItems();
            if (!(items2 == null || (musNotice2 = (MusNotice) n.h((List) items2)) == null)) {
                if (musNotice2.createTime >= noticeItems.getMaxTime() || (next.getListType() == 2 && !musNotice2.hasRead)) {
                    list.add(musNotice2);
                    musNotice2.noticeListType = next.getListType();
                    com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar2 = musNotice2.templateNotice;
                    if (eVar2 != null) {
                        eVar2.f112855m = next.getGroup();
                    }
                    it.remove();
                }
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: java.util.List<com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001a  */
    /* JADX WARNING: Removed duplicated region for block: B:166:0x027a A[LOOP:10: B:164:0x0274->B:166:0x027a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:194:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0107  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse r10, int r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 662
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.model.MusNewNotificationModel.handleData(com.ss.android.ugc.aweme.notice.repo.list.bean.MessageResponse, int, boolean):void");
    }
}
