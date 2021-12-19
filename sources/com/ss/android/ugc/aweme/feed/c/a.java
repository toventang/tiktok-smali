package com.ss.android.ugc.aweme.feed.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.feed.api.BackUpApi;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsResponse;
import com.ss.android.ugc.d.a.c;
import h.a.af;
import h.a.ag;
import h.a.n;
import h.f.b.l;
import h.j.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutionException;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f92680a = new a();

    private a() {
    }

    static {
        Covode.recordClassIndex(58778);
    }

    public static final void a(String str, int i2) {
        l.d(str, "");
        try {
            AwemeStatisticsResponse awemeStatisticsResponse = BackUpApi.f91916a.queryAwemeStatistics(str, i2).get();
            List<AwemeStatisticsBackup> statisticsList = awemeStatisticsResponse.getStatisticsList();
            if (statisticsList != null) {
                Iterator it = n.a((Collection<?>) statisticsList).iterator();
                while (it.hasNext()) {
                    AwemeStatisticsBackup awemeStatisticsBackup = statisticsList.get(((af) it).a());
                    if (awemeStatisticsBackup != null) {
                        String aid = awemeStatisticsBackup.getAid();
                        Aweme b2 = AwemeService.b().b(aid);
                        if (b2 == null) {
                            com.ss.android.ugc.aweme.framework.a.a.a(4, "FeedBackupHelper", "FeedBackupHelper find that aweme is null!".concat(String.valueOf(aid)));
                        } else {
                            com.ss.android.ugc.aweme.framework.a.a.a(4, "FeedBackupHelper", "FeedBackupHelper start to update this aweme:".concat(String.valueOf(awemeStatisticsBackup)));
                            if (i2 == 2) {
                                if (b2.getStatistics() == null) {
                                    b2.setStatistics(new AwemeStatistics());
                                }
                                Long commentCount = awemeStatisticsBackup.getCommentCount();
                                if (commentCount == null) {
                                    l.b();
                                }
                                if (commentCount.longValue() > 0) {
                                    AwemeStatistics statistics = b2.getStatistics();
                                    l.b(statistics, "");
                                    statistics.setAid(aid);
                                    AwemeStatistics statistics2 = b2.getStatistics();
                                    l.b(statistics2, "");
                                    Long commentCount2 = awemeStatisticsBackup.getCommentCount();
                                    if (commentCount2 == null) {
                                        l.b();
                                    }
                                    statistics2.setCommentCount(commentCount2.longValue());
                                }
                            } else if (i2 == 3 || i2 == 1) {
                                if (b2.getStatistics() == null) {
                                    b2.setStatistics(new AwemeStatistics());
                                }
                                AwemeStatistics statistics3 = b2.getStatistics();
                                if (statistics3 != null) {
                                    statistics3.setAid(awemeStatisticsBackup.getAid());
                                    Long commentCount3 = awemeStatisticsBackup.getCommentCount();
                                    if (commentCount3 == null) {
                                        l.b();
                                    }
                                    if (commentCount3.longValue() > 0) {
                                        Long commentCount4 = awemeStatisticsBackup.getCommentCount();
                                        if (commentCount4 == null) {
                                            l.b();
                                        }
                                        statistics3.setCommentCount(commentCount4.longValue());
                                    }
                                    Long diggCount = awemeStatisticsBackup.getDiggCount();
                                    if (diggCount == null) {
                                        l.b();
                                    }
                                    if (diggCount.longValue() > 0) {
                                        Long diggCount2 = awemeStatisticsBackup.getDiggCount();
                                        if (diggCount2 == null) {
                                            l.b();
                                        }
                                        statistics3.setDiggCount(diggCount2.longValue());
                                    }
                                    Long playCount = awemeStatisticsBackup.getPlayCount();
                                    if (playCount == null) {
                                        l.b();
                                    }
                                    if (playCount.longValue() > 0) {
                                        Long playCount2 = awemeStatisticsBackup.getPlayCount();
                                        if (playCount2 == null) {
                                            l.b();
                                        }
                                        statistics3.setPlayCount(playCount2.longValue());
                                    }
                                    Long downloadCount = awemeStatisticsBackup.getDownloadCount();
                                    if (downloadCount == null) {
                                        l.b();
                                    }
                                    if (downloadCount.longValue() > 0) {
                                        Long downloadCount2 = awemeStatisticsBackup.getDownloadCount();
                                        if (downloadCount2 == null) {
                                            l.b();
                                        }
                                        statistics3.setDownloadCount(downloadCount2.longValue());
                                    }
                                    Long shareCount = awemeStatisticsBackup.getShareCount();
                                    if (shareCount == null) {
                                        l.b();
                                    }
                                    if (shareCount.longValue() > 0) {
                                        Long shareCount2 = awemeStatisticsBackup.getShareCount();
                                        if (shareCount2 == null) {
                                            l.b();
                                        }
                                        statistics3.setShareCount(shareCount2.longValue());
                                    }
                                    Long forwardCount = awemeStatisticsBackup.getForwardCount();
                                    if (forwardCount == null) {
                                        l.b();
                                    }
                                    if (forwardCount.longValue() > 0) {
                                        Long forwardCount2 = awemeStatisticsBackup.getForwardCount();
                                        if (forwardCount2 == null) {
                                            l.b();
                                        }
                                        statistics3.setForwardCount(forwardCount2.longValue());
                                    }
                                }
                            }
                        }
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(h.b(ag.a(n.a((Iterable) statisticsList, 10)), 16));
                for (T t : statisticsList) {
                    linkedHashMap.put(t.getAid(), t);
                }
                c.a(new com.ss.android.ugc.aweme.feed.i.a(linkedHashMap, i2));
                return;
            }
            com.ss.android.ugc.aweme.framework.a.a.a(4, "FeedBackupHelper", "FeedBackupHelper get rsp,but list is null. rsp content :".concat(String.valueOf(awemeStatisticsResponse)));
        } catch (ExecutionException e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Exception) com.ss.android.ugc.aweme.base.api.a.getCompatibleException(e2));
        }
    }
}
