package com.ss.android.ugc.aweme.framework.services;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.service.IMCoreProxyService;
import com.bytedance.ies.ugc.aweme.commercialize.scene.impl.AdSceneServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.search.core.SearchAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashAdServiceImpl;
import com.bytedance.ies.ugc.aweme.commercialize.splash.core.SplashSettingServiceImpl;
import com.bytedance.ies.ugc.aweme.network.NetworkService;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.tiktok.homepage.mainpagefragment.notification.NotificationCountViewManager;
import com.bytedance.tiktok.homepage.services.MainFragmentCacheExpServiceImpl;
import com.bytedance.tiktok.homepage.services.MainPageFragmentImpl;
import com.ss.android.legoimpl.ABLegoTaskImpl;
import com.ss.android.ugc.AwemeAppBuildConfig;
import com.ss.android.ugc.aweme.AccountService;
import com.ss.android.ugc.aweme.ActivityRouterServiceImpl;
import com.ss.android.ugc.aweme.BuildConfigAllServiceImpl;
import com.ss.android.ugc.aweme.CQrcodeService;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import com.ss.android.ugc.aweme.DetailFeedServiceImpl;
import com.ss.android.ugc.aweme.NewUserJourneyService;
import com.ss.android.ugc.aweme.PreloadApiServiceImpl;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.ProfileNaviServiceImpl;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.UIUXBugsExperimentService;
import com.ss.android.ugc.aweme.UgAllServiceImpl;
import com.ss.android.ugc.aweme.account.AccountInitServiceImpl;
import com.ss.android.ugc.aweme.account.AgeGateService;
import com.ss.android.ugc.aweme.account.PreLoginHandleService;
import com.ss.android.ugc.aweme.account.apiguard.ApiGuardService;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.account.experiment.service.AccountExperimentLayerServiceImpl;
import com.ss.android.ugc.aweme.account.experiment.service.NonPersonalizationService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.account.login.v2.ui.PrivateAccountTipsViewDelegate;
import com.ss.android.ugc.aweme.account.profilebadge.ProfileBadgeServiceImpl;
import com.ss.android.ugc.aweme.ad.FeedAdServiceImpl;
import com.ss.android.ugc.aweme.ad.comment.AdCommentService;
import com.ss.android.ugc.aweme.ad.feed.CommercializeFeedServiceImpl;
import com.ss.android.ugc.aweme.ad.preload.AdLandPagePreloadServiceImpl;
import com.ss.android.ugc.aweme.app.AwemeApplicationServiceImpl;
import com.ss.android.ugc.aweme.app.InitAllServiceImpl;
import com.ss.android.ugc.aweme.app.accountsdk.AccountInitializer;
import com.ss.android.ugc.aweme.app.launch.MobLaunchImpl;
import com.ss.android.ugc.aweme.app.services.DownloadService;
import com.ss.android.ugc.aweme.app.services.Feed0VVManagerService;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.app.services.NewUserMainModuleService;
import com.ss.android.ugc.aweme.app.services.PushLaunchPageAssistantService;
import com.ss.android.ugc.aweme.app.services.RegionService;
import com.ss.android.ugc.aweme.app.services.WebviewService;
import com.ss.android.ugc.aweme.appsflyer.AppsflyerImpl;
import com.ss.android.ugc.aweme.awemeservice.AwemeService;
import com.ss.android.ugc.aweme.awemeservice.RequestIdService;
import com.ss.android.ugc.aweme.benchmark.BTCHConfigurationImpl;
import com.ss.android.ugc.aweme.benchmark.BenchmarkInitService;
import com.ss.android.ugc.aweme.benchmark.BenchmarkServiceImpl;
import com.ss.android.ugc.aweme.bullet.BulletHostProxy;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.captcha.util.CaptchaHelperServiceImpl;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailLegacyServiceImpl;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.challenge.ChallengeDetailServiceImpl;
import com.ss.android.ugc.aweme.challenge.service.ChallengeDetailProvicer;
import com.ss.android.ugc.aweme.challenge.service.ChallengeServiceImpl;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.CommentStickerRecordServiceImpl;
import com.ss.android.ugc.aweme.comment.util.NoticeCommentHelperServiceImpl;
import com.ss.android.ugc.aweme.commerce.sdk.service.CommerceService;
import com.ss.android.ugc.aweme.commerce.sdk.service.ShoppingDetailPageOperatorService;
import com.ss.android.ugc.aweme.commerce_challenge_impl.service.CommerceChallengeServiceImpl;
import com.ss.android.ugc.aweme.commerce_sticker_impl.service.CommerceStickerServiceImpl;
import com.ss.android.ugc.aweme.commercialize.AdCardServiceImpl;
import com.ss.android.ugc.aweme.commercialize.LegacyCommercializeServiceImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdCommentDependImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.commercialize.depend.AdTrackDependImpl;
import com.ss.android.ugc.aweme.commercialize.e_commerce.service.ShoppingAdsServiceImpl;
import com.ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.promote.service.LiveParasiticModuleLaunchServicePromoteImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.CommercializeLiveServiceImpl;
import com.ss.android.ugc.aweme.commercialize.live.service.ILiveParasiticModuleLaunchServiceCommercializeImpl;
import com.ss.android.ugc.aweme.commercialize.log.LogHelperImpl;
import com.ss.android.ugc.aweme.commercialize.media.impl.service.CommerceMediaServiceImpl;
import com.ss.android.ugc.aweme.commercialize.preview.service.AdsPreviewServiceImpl;
import com.ss.android.ugc.aweme.commercialize.profile.talent.TalentAdRevenueShareServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.AdCardOutService;
import com.ss.android.ugc.aweme.commercialize.service.AdLandPageDependOutService;
import com.ss.android.ugc.aweme.commercialize.service.ChallengeDetailProviderOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceChallengeOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceCommonServiceImpl;
import com.ss.android.ugc.aweme.commercialize.service.CommerceEggOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceMediaOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommerceStickerOutService;
import com.ss.android.ugc.aweme.commercialize.service.CommercializeAdOutService;
import com.ss.android.ugc.aweme.commercialize.service.SplashAdOutService;
import com.ss.android.ugc.aweme.commercialize.service.TcmOutService;
import com.ss.android.ugc.aweme.commercialize.utils.NoticeChallengePropertyUtilImpl;
import com.ss.android.ugc.aweme.commercialize.views.AdLightWebPageOpenUtils;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.compliance.ComplianceDependServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AgeGateServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.AlgofreeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.BanAppealServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ChildModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ComplianceBusinessServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.FTCServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.GDPRServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PrivateAccountServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.ReportServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TermsConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.TpcConsentServiceImpl;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.VPAServiceImpl;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceMonitorServiceImpl;
import com.ss.android.ugc.aweme.compliance.common.serviceimpl.ComplianceSettingsServiceImpl;
import com.ss.android.ugc.aweme.compliance.privacy.impl.PrivacyServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.AntiAddictionServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.FamilyPairingServiceImpl;
import com.ss.android.ugc.aweme.compliance.protection.serviceimpl.ProtectionServiceImpl;
import com.ss.android.ugc.aweme.component.music.MusicService;
import com.ss.android.ugc.aweme.contentlanguage.ContentLanguageServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.CrossPlatformServiceImpl;
import com.ss.android.ugc.aweme.crossplatform.HybridRegistryProvider;
import com.ss.android.ugc.aweme.crossplatform.business.MixActivityContainerProvider;
import com.ss.android.ugc.aweme.deeplink.DeepLinkServiceImpl;
import com.ss.android.ugc.aweme.detail.operators.DetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.detail.operators.ProfileDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.detail.operators.SearchDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.di.BulletServiceImpl;
import com.ss.android.ugc.aweme.di.CommerceServiceImpl;
import com.ss.android.ugc.aweme.di.ImEntranceService;
import com.ss.android.ugc.aweme.discover.DiscoverAllServiceImpl;
import com.ss.android.ugc.aweme.discover.DiscoveryServiceImpl;
import com.ss.android.ugc.aweme.discover.hitrank.RankHelperServiceImpl;
import com.ss.android.ugc.aweme.dmt_integration.AVInitializerImpl;
import com.ss.android.ugc.aweme.donation.DonationServiceImpl;
import com.ss.android.ugc.aweme.download.impl.component_impl.DownloadServiceImpl;
import com.ss.android.ugc.aweme.dsp.service.MusicDspServiceImpl;
import com.ss.android.ugc.aweme.duet.impl.DuetDetailServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.preloader.LowResolutionImageCache;
import com.ss.android.ugc.aweme.ecommerce.router.FallbackDetector;
import com.ss.android.ugc.aweme.ecommerce.router.StrategyService;
import com.ss.android.ugc.aweme.ecommercelive.framework.serviceimpl.ILiveParasiticModuleLaunchServiceECImpl;
import com.ss.android.ugc.aweme.effectplatforn.EffectPlatformFactory;
import com.ss.android.ugc.aweme.favorites.service.FavoriteServiceImpl;
import com.ss.android.ugc.aweme.feed.CommonFeedLaunchServiceImpl;
import com.ss.android.ugc.aweme.feed.FeedApiService;
import com.ss.android.ugc.aweme.feed.RecommendFeedDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.feed.api.FeedModuleServiceImpl;
import com.ss.android.ugc.aweme.feed.operator.FollowFeedDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.feed.service.FeedComponentServiceImpl;
import com.ss.android.ugc.aweme.feedback.runtime.behavior.RuntimeBehaviorServiceImpl;
import com.ss.android.ugc.aweme.follow.oftenwatch.OftenWatchDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.follow.service.FollowFeedServiceImpl;
import com.ss.android.ugc.aweme.forward.statistics.ForwardStatisticsServiceImpl;
import com.ss.android.ugc.aweme.friends.service.ContactServiceImpl;
import com.ss.android.ugc.aweme.friends.service.FriendsServiceImpl;
import com.ss.android.ugc.aweme.friends.service.InviteUseListService;
import com.ss.android.ugc.aweme.friends.services.FollowService;
import com.ss.android.ugc.aweme.homepage.experiment.HomepageExperimentServiceImpl;
import com.ss.android.ugc.aweme.homepage.msadapt.MSAdaptionService;
import com.ss.android.ugc.aweme.homepage.story.sidebar.StorySidebarOperatorServiceImpl;
import com.ss.android.ugc.aweme.hybridkit.HybridKitTaskImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.ui.helper.BaAutoMessageServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.input.video.controller.FavoriteVideoChatDetailPageOperatorService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.ImplService;
import com.ss.android.ugc.aweme.im.sdk.common.data.service.IMAdapterServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.iescore.IMCoreDependProxyService;
import com.ss.android.ugc.aweme.im.sdk.notification.NotificationManagerServiceImpl;
import com.ss.android.ugc.aweme.im.sdk.u16.controller.IMUnder16ProxyImpl;
import com.ss.android.ugc.aweme.inferenceengine.InferenceEngineServiceImpl;
import com.ss.android.ugc.aweme.influencer.ECommerceLiveBridgeMethodServiceImpl;
import com.ss.android.ugc.aweme.influencer.ECommerceRNToLynxConfigService;
import com.ss.android.ugc.aweme.influencer.ecommercelive.framework.settings.ECommerceLiveSettingsServiceImpl;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.initializer.StorageManagerService;
import com.ss.android.ugc.aweme.internal.AVCommentServiceImpl;
import com.ss.android.ugc.aweme.internal.AVCommerceServiceImpl;
import com.ss.android.ugc.aweme.internal.AVUIUXBugsExperimentServiceDiff;
import com.ss.android.ugc.aweme.internal.CrossLanguageUserExperiment;
import com.ss.android.ugc.aweme.internal.ShoutOutServiceImpl;
import com.ss.android.ugc.aweme.kids.commonfeed.report.ReportAwemeManager;
import com.ss.android.ugc.aweme.kids.component.music.KidsMusicEntrance;
import com.ss.android.ugc.aweme.kids.homepage.compliance.KidsComplianceServiceImpl;
import com.ss.android.ugc.aweme.kids.intergration.abmock.KidsRegisterMockImpl;
import com.ss.android.ugc.aweme.kids.intergration.account.KidsAccountServiceImpl;
import com.ss.android.ugc.aweme.kids.intergration.common.KidsCommonServiceImpl;
import com.ss.android.ugc.aweme.kids.recommendfeed.RecommendFeedServiceImpl;
import com.ss.android.ugc.aweme.kids.setting.wellbeing.KidsWellbeingServiceImpl;
import com.ss.android.ugc.aweme.landpage.AdLandPageServiceImpl;
import com.ss.android.ugc.aweme.launcher.LauncherServiceImpl;
import com.ss.android.ugc.aweme.launcher.serviceimpl.account.AccountImpl;
import com.ss.android.ugc.aweme.launcher.serviceimpl.crashsdk.CrashSdkImpl;
import com.ss.android.ugc.aweme.launcher.serviceimpl.godzilla.GodzillaImpl;
import com.ss.android.ugc.aweme.legacy.AbTestManagerImpl;
import com.ss.android.ugc.aweme.legacy.ColdLaunchRequestCombinerImpl;
import com.ss.android.ugc.aweme.legacy.FollowTabBubbleGuideHelperImpl;
import com.ss.android.ugc.aweme.legacy.SearchResultStatisticsImpl;
import com.ss.android.ugc.aweme.legoImp.CrashSdkTaskImpl;
import com.ss.android.ugc.aweme.legoImp.LoginProxyImpl;
import com.ss.android.ugc.aweme.legoImp.NetWorkInjectImpl;
import com.ss.android.ugc.aweme.legoImp.NetworkConfigProvider;
import com.ss.android.ugc.aweme.legoImp.ProviderConfigOutImpl;
import com.ss.android.ugc.aweme.legoImp.SysOptTaskImpl;
import com.ss.android.ugc.aweme.legoImp.WatcherImpl;
import com.ss.android.ugc.aweme.legoImp.task.PowerPermissionsTask;
import com.ss.android.ugc.aweme.legoImpl.AccountInitializerTaskImpl;
import com.ss.android.ugc.aweme.legoImpl.FrescoLegoTaskImpl;
import com.ss.android.ugc.aweme.live.LiveHostOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.live.slot.LiveBusinessParasiticModule;
import com.ss.android.ugc.aweme.livewallpaper.config.WallpaperGuide1Config;
import com.ss.android.ugc.aweme.livewallpaper.config.WallpaperGuide2Config;
import com.ss.android.ugc.aweme.locale.LocalServiceImpl;
import com.ss.android.ugc.aweme.login.LoginUtilsServiceImpl;
import com.ss.android.ugc.aweme.main.MainPageExperimentServiceImpl;
import com.ss.android.ugc.aweme.main.MainPageServiceImpl;
import com.ss.android.ugc.aweme.main.replace.ReplaceMusicDownloadService;
import com.ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.ss.android.ugc.aweme.mix.MixHelperService;
import com.ss.android.ugc.aweme.mix.services.DetailMixOperatorServiceImpl;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.ml.data.MLDataCenterServiceImpl;
import com.ss.android.ugc.aweme.ml.data.SmartDataTrackerServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.MLCommonServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedAdUIServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedLoadMoreServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartFeedPreloadServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadCommentV2ServiceImpl;
import com.ss.android.ugc.aweme.ml.impl.SmartPreloadProfileV2ServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartClassifyServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartCommonPreloadServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartDataCenterApiServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartMLSceneServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartPlaytimePredictServiceImpl;
import com.ss.android.ugc.aweme.ml.infra.SmartRegressCalculateServiceImpl;
import com.ss.android.ugc.aweme.music.MusicPreloaderServiceImpl;
import com.ss.android.ugc.aweme.music.service.MusicDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.music.service.MusicDetailService;
import com.ss.android.ugc.aweme.mvtemplate.impl.MovieReuseServiceImpl;
import com.ss.android.ugc.aweme.net.interceptor.DevicesNullInterceptor;
import com.ss.android.ugc.aweme.net.interceptor.NetWorkSpeedInterceptor;
import com.ss.android.ugc.aweme.net.preload.PowerPreloadServiceImpl;
import com.ss.android.ugc.aweme.newfollow.statistics.FollowStatisticsServiceImpl;
import com.ss.android.ugc.aweme.newuser.NewUserImpl;
import com.ss.android.ugc.aweme.notice.DmNoticeProxyImpl;
import com.ss.android.ugc.aweme.notification.service.NoticeCountServiceImpl;
import com.ss.android.ugc.aweme.notification.service.NoticeServiceImpl;
import com.ss.android.ugc.aweme.notification.service.RedPointServiceImpl;
import com.ss.android.ugc.aweme.opensdkservice.OpenPlatformServiceImpl;
import com.ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.ss.android.ugc.aweme.out.AVServiceImpl;
import com.ss.android.ugc.aweme.plugin.aab.AabPluginServiceImpl;
import com.ss.android.ugc.aweme.poi.service.PoiServiceImpl;
import com.ss.android.ugc.aweme.poi_api.service.PoiVideoListDefaultOperatorService;
import com.ss.android.ugc.aweme.poi_map.service.PoiMapServiceImpl;
import com.ss.android.ugc.aweme.profile.ProfileServiceImpl;
import com.ss.android.ugc.aweme.profile.effect.EffectDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.prop.impl.PropReuseServiceImpl;
import com.ss.android.ugc.aweme.property.VEABServiceImpl;
import com.ss.android.ugc.aweme.qainvitation.service.QAInvitationService;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.qrcode.QRCodeServiceImpl;
import com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanImpl;
import com.ss.android.ugc.aweme.question.QuestionDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentServiceImpl;
import com.ss.android.ugc.aweme.recommend.users.IRecommendUsersServiceImpl;
import com.ss.android.ugc.aweme.recommend.users.RecommendUserServiceImpl;
import com.ss.android.ugc.aweme.request_combine.common.ServerPortraitCollections;
import com.ss.android.ugc.aweme.request_combine.request.SettingRequestExtraInfoImpl;
import com.ss.android.ugc.aweme.search.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.service.SearchUserService;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import com.ss.android.ugc.aweme.service.CommonFeedApiService;
import com.ss.android.ugc.aweme.service.EOYDetailPageOperatorServiceImpl;
import com.ss.android.ugc.aweme.service.EOYServiceImpl;
import com.ss.android.ugc.aweme.services.AccountHelperService;
import com.ss.android.ugc.aweme.services.ApiNetworkServiceForAccount;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.services.BusinessComponentServiceImpl;
import com.ss.android.ugc.aweme.services.BusinessGoodsServiceImpl;
import com.ss.android.ugc.aweme.services.DeleteAccountService;
import com.ss.android.ugc.aweme.services.IAVMixFeedServiceImpl;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.services.IRessoAnchorServiceImpl;
import com.ss.android.ugc.aweme.services.ImageUserServiceImpl;
import com.ss.android.ugc.aweme.services.LinkTypeTagsPriorityManagerImpl;
import com.ss.android.ugc.aweme.services.MainServiceForJsb;
import com.ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.ss.android.ugc.aweme.services.MainServiceImpl;
import com.ss.android.ugc.aweme.services.MandatoryLoginService;
import com.ss.android.ugc.aweme.services.NoticeABServiceImpl;
import com.ss.android.ugc.aweme.services.PerformanceMainServiceImpl;
import com.ss.android.ugc.aweme.services.PowerContextImpl;
import com.ss.android.ugc.aweme.services.ProfileDependentComponentImpl;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.ss.android.ugc.aweme.services.UserInfoUpdateAdapterService;
import com.ss.android.ugc.aweme.services.WebViewTweakerService;
import com.ss.android.ugc.aweme.services.function.FunctionSupportServiceImpl;
import com.ss.android.ugc.aweme.servicimpl.AvSearchUserServiceImpl;
import com.ss.android.ugc.aweme.servicimpl.EditRootSceneFactoryDelegate;
import com.ss.android.ugc.aweme.servicimpl.EmojiServiceImplDiff;
import com.ss.android.ugc.aweme.servicimpl.PageFactoryDelegate;
import com.ss.android.ugc.aweme.servicimpl.SplitVideoServiceImpl;
import com.ss.android.ugc.aweme.servicimpl.TTEPPageFactoryDelegate;
import com.ss.android.ugc.aweme.setting.UpdateSettingServiceImpl;
import com.ss.android.ugc.aweme.setting.services.AppUpdateService;
import com.ss.android.ugc.aweme.setting.services.CustomActivityOnCrashServiceImpl;
import com.ss.android.ugc.aweme.setting.services.I18nService;
import com.ss.android.ugc.aweme.setting.services.PrivacySettingService;
import com.ss.android.ugc.aweme.setting.services.SettingDependServiceImpl;
import com.ss.android.ugc.aweme.setting.services.SettingServiceImpl;
import com.ss.android.ugc.aweme.setting.services.VideoGiftService;
import com.ss.android.ugc.aweme.settingsrequest.SettingManagerServiceImpl;
import com.ss.android.ugc.aweme.share.OpenSDKUtilsServiceImpl;
import com.ss.android.ugc.aweme.share.ShareDependServiceImpl;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.ShareFlavorServiceImpl;
import com.ss.android.ugc.aweme.share.ShareH5ServiceImpl;
import com.ss.android.ugc.aweme.share.ShareServiceImpl;
import com.ss.android.ugc.aweme.sharer.ext.BandChannelService;
import com.ss.android.ugc.aweme.sharer.ext.EmailChannelService;
import com.ss.android.ugc.aweme.sharer.ext.FacebookChannelService;
import com.ss.android.ugc.aweme.sharer.ext.FacebookLiteChannelService;
import com.ss.android.ugc.aweme.sharer.ext.FacebookStoryChannelService;
import com.ss.android.ugc.aweme.sharer.ext.ImgurChannelService;
import com.ss.android.ugc.aweme.sharer.ext.InstagramChannelService;
import com.ss.android.ugc.aweme.sharer.ext.InstagramStoryChannelService;
import com.ss.android.ugc.aweme.sharer.ext.KakaoStoryChannelService;
import com.ss.android.ugc.aweme.sharer.ext.KakaotalkChannelService;
import com.ss.android.ugc.aweme.sharer.ext.LineChannelService;
import com.ss.android.ugc.aweme.sharer.ext.MessengerChannelService;
import com.ss.android.ugc.aweme.sharer.ext.MessengerLiteChannelService;
import com.ss.android.ugc.aweme.sharer.ext.NaverBlogChannelService;
import com.ss.android.ugc.aweme.sharer.ext.NaverCafeChannelService;
import com.ss.android.ugc.aweme.sharer.ext.RedditChannelService;
import com.ss.android.ugc.aweme.sharer.ext.SmsChannelService;
import com.ss.android.ugc.aweme.sharer.ext.SnapchatChannelService;
import com.ss.android.ugc.aweme.sharer.ext.SystemChannelService;
import com.ss.android.ugc.aweme.sharer.ext.TelegramChannelService;
import com.ss.android.ugc.aweme.sharer.ext.TwitterChannelService;
import com.ss.android.ugc.aweme.sharer.ext.ViberChannelService;
import com.ss.android.ugc.aweme.sharer.ext.VkChannelService;
import com.ss.android.ugc.aweme.sharer.ext.WhatsappChannelService;
import com.ss.android.ugc.aweme.sharer.ext.WhatsappStatusChannelService;
import com.ss.android.ugc.aweme.sharer.ext.ZaloChannelService;
import com.ss.android.ugc.aweme.shortvideo.AVApiImpl;
import com.ss.android.ugc.aweme.shortvideo.DraftUpdateServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.DuetDownloadService;
import com.ss.android.ugc.aweme.shortvideo.MediaChosenResultProcessFactory;
import com.ss.android.ugc.aweme.shortvideo.PublishServiceFactoryImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.VideoLengthChecker;
import com.ss.android.ugc.aweme.shortvideo.festival.FestivalService;
import com.ss.android.ugc.aweme.shortvideo.sticker.comment.CommentFavoriteServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.sticker.question.QuestionFavoriteServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.stitch.StitchServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.subtitle.CaptionServiceImpl;
import com.ss.android.ugc.aweme.shoutouts.review.ShoutoutsReviewService;
import com.ss.android.ugc.aweme.social.ext.RelationComService;
import com.ss.android.ugc.aweme.social.ext.RelationExtService;
import com.ss.android.ugc.aweme.social.monitor.RelationMonitorServiceImp;
import com.ss.android.ugc.aweme.social.widget.card.SocialCardServiceImp;
import com.ss.android.ugc.aweme.specact.SpecActServiceImpl;
import com.ss.android.ugc.aweme.sticker.StickerServiceImpl;
import com.ss.android.ugc.aweme.story.draft.StoryDraftServiceImpl;
import com.ss.android.ugc.aweme.story.feed.detail.StoryDefaultOperatorServiceImpl;
import com.ss.android.ugc.aweme.story.feed.detail.StoryOperatorServiceImpl;
import com.ss.android.ugc.aweme.story.live.NoticeLiveServiceAdapterImpl;
import com.ss.android.ugc.aweme.story.live.NoticeLiveWatcherUtilImpl;
import com.ss.android.ugc.aweme.story.publish.StoryPublishServiceImpl;
import com.ss.android.ugc.aweme.story.service.StoryServiceImpl;
import com.ss.android.ugc.aweme.tcm.impl.service.TcmServiceImpl;
import com.ss.android.ugc.aweme.tools.live.sticker.StickerViewServiceImpl;
import com.ss.android.ugc.aweme.trending.service.TrendingDetailServiceImpl;
import com.ss.android.ugc.aweme.turbo.vi.TurboViImpl;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.ugc.aweme.ug.praise.PraiseGuideConfig;
import com.ss.android.ugc.aweme.upvote.service.UpvoteServiceImpl;
import com.ss.android.ugc.aweme.userservice.UserService;
import com.ss.android.ugc.aweme.utils.AppWidgetServiceImpl;
import com.ss.android.ugc.aweme.utils.GsonHolder;
import com.ss.android.ugc.aweme.utils.InterceptorHolder;
import com.ss.android.ugc.aweme.utils.LanguageService;
import com.ss.android.ugc.aweme.utils.NotificationClickHelperImpl;
import com.ss.android.ugc.aweme.utils.SchemaPageHelperImpl;
import com.ss.android.ugc.aweme.utils.WSHelperImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoGlobalInitServiceImpl;
import com.ss.android.ugc.aweme.utils.gecko.GeckoLocalServiceImpl;
import com.ss.android.ugc.aweme.watermark.WaterMarkServiceImpl;
import com.ss.android.ugc.aweme.web.GeckoXClientManager;
import com.ss.android.ugc.aweme.zerorating.ZeroRatingServiceImpl;
import com.ss.android.ugc.awemepushlib.interaction.PushService;
import com.ss.android.ugc.gamora.editor.EditVideoInfoServiceImpl;
import com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl;
import com.ss.android.ugc.tiktok.deeplink.impl.DeeplinkPrefetchImpl;
import com.ss.android.ugc.tiktok.seclink.impl.SecLinkServiceImpl;
import com.ss.android.ugc.trill.setting.TranslatedCaptionCacheServiceImpl;
import com.tt.appbrandimpl.MiniAppDependServiceImpl;
import com.zhiliaoapp.musically.openauthorize.AuthorizeCommonService;
import dmt.av.services.VEEncodingImpl;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class StaticServiceImplManager {
    private Map<String, Object> serviceImplCache = new ConcurrentHashMap();
    final Set<String> serviceImplNotExistSet = Collections.synchronizedSet(new HashSet());
    private Map<String, Set<Object>> serviceImplSetCache = new ConcurrentHashMap();
    final Set<String> serviceImplSetNotExistSet = Collections.synchronizedSet(new HashSet());

    static {
        Covode.recordClassIndex(61370);
    }

    /* access modifiers changed from: package-private */
    public static class SingleInstanceHolder {
        public static final StaticServiceImplManager INSTANCE = new StaticServiceImplManager();

        private SingleInstanceHolder() {
        }

        static {
            Covode.recordClassIndex(61373);
        }
    }

    public static StaticServiceImplManager getInstance() {
        return SingleInstanceHolder.INSTANCE;
    }

    public class Partition4 {
        static {
            Covode.recordClassIndex(61371);
        }

        public static <T> T getStaticServiceImplReal(StaticServiceImplManager staticServiceImplManager, Class<T> cls) {
            switch (cls.getName().hashCode()) {
                case -2142042626:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ICrossPlatformLegacyService")) {
                        T t = (T) new CrossPlatformLegacyServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ICrossPlatformLegacyService", t);
                        return t;
                    }
                    break;
                case -2133121688:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService")) {
                        T t2 = (T) new BaAutoMessageServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService", t2);
                        return t2;
                    }
                    break;
                case -2118722668:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IFeedAdService")) {
                        T t3 = (T) new FeedAdServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ad.feed.IFeedAdService", t3);
                        return t3;
                    }
                    break;
                case -2116325664:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService")) {
                        T t4 = (T) new TranslatedCaptionCacheServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService", t4);
                        return t4;
                    }
                    break;
                case -2116177744:
                    if (cls.getName().equals("com.bytedance.ies.powerpermissions.IGetInterceptor")) {
                        T t5 = (T) new PowerPermissionsTask();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.powerpermissions.IGetInterceptor", t5);
                        return t5;
                    }
                    break;
                case -2097916849:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService")) {
                        T t6 = (T) new GDPRServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService", t6);
                        return t6;
                    }
                    break;
                case -2088649324:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService")) {
                        return (T) new OpenPlatformServiceImpl();
                    }
                    break;
                case -2079081456:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageFragment")) {
                        T t7 = (T) new MainPageFragmentImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.main.IMainPageFragment", t7);
                        return t7;
                    }
                    break;
                case -2072883067:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.story.IStoryDraftService")) {
                        T t8 = (T) new StoryDraftServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.story.IStoryDraftService", t8);
                        return t8;
                    }
                    break;
                case -2046909495:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountExperimentLayerService")) {
                        T t9 = (T) new AccountExperimentLayerServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IAccountExperimentLayerService", t9);
                        return t9;
                    }
                    break;
                case -2045744714:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.INotificationManagerService")) {
                        T t10 = (T) new NotificationManagerServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.im.INotificationManagerService", t10);
                        return t10;
                    }
                    break;
                case -2045670388:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView")) {
                        T t11 = (T) new PrivateAccountTipsViewDelegate();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView", t11);
                        return t11;
                    }
                    break;
                case -2041007322:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IInternalAVService")) {
                        T t12 = (T) new AVServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.IInternalAVService", t12);
                        return t12;
                    }
                    break;
                case -2009041091:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tcm.api.service.ITcmOutService")) {
                        return (T) new TcmOutService();
                    }
                    break;
                case -1998285850:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IWebViewService")) {
                        T t13 = (T) new WebviewService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.app.services.IWebViewService", t13);
                        return t13;
                    }
                    break;
                case -1994319489:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IMainService")) {
                        return (T) new MainServiceImpl();
                    }
                    break;
                case -1947571277:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService")) {
                        T t14 = (T) new ECommerceService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService", t14);
                        return t14;
                    }
                    break;
                case -1916678834:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.ICrossLanguageUserService")) {
                        T t15 = (T) new CrossLanguageUserExperiment();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.internal.ICrossLanguageUserService", t15);
                        return t15;
                    }
                    break;
                case -1902468907:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService")) {
                        T t16 = (T) new CommercializeLiveServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService", t16);
                        return t16;
                    }
                    break;
                case -1902050433:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil")) {
                        T t17 = (T) new NoticeChallengePropertyUtilImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil", t17);
                        return t17;
                    }
                    break;
                case -1890851076:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessGoodsService")) {
                        T t18 = (T) new BusinessGoodsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.IBusinessGoodsService", t18);
                        return t18;
                    }
                    break;
                case -1884758289:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService")) {
                        T t19 = (T) new AlgofreeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService", t19);
                        return t19;
                    }
                    break;
                case -1882551236:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.account.IAccountInitService")) {
                        T t20 = (T) new AccountInitServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.account.IAccountInitService", t20);
                        return t20;
                    }
                    break;
                case -1863869896:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageExperimentService")) {
                        T t21 = (T) new MainPageExperimentServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.main.IMainPageExperimentService", t21);
                        return t21;
                    }
                    break;
                case -1827092331:
                    if (cls.getName().equals("com.ss.android.ugc.gamora.PageFactory")) {
                        T t22 = (T) new PageFactoryDelegate();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.gamora.PageFactory", t22);
                        return t22;
                    }
                    break;
                case -1816256684:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.OldRedPointService")) {
                        T t23 = (T) new RedPointServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.count.OldRedPointService", t23);
                        return t23;
                    }
                    break;
                case -1811419603:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.opensdk.IOpenSDKUtilsService")) {
                        T t24 = (T) new OpenSDKUtilsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.opensdk.IOpenSDKUtilsService", t24);
                        return t24;
                    }
                    break;
                case -1806927191:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.journey.INewUserJourneyService")) {
                        T t25 = (T) new NewUserJourneyService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.journey.INewUserJourneyService", t25);
                        return t25;
                    }
                    break;
                case -1806639590:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feed.service.IFeedComponentService")) {
                        T t26 = (T) new FeedComponentServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.feed.service.IFeedComponentService", t26);
                        return t26;
                    }
                    break;
                case -1799242804:
                    if (cls.getName().equals("com.bytedance.ies.watcher.IWatcher")) {
                        T t27 = (T) new WatcherImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.watcher.IWatcher", t27);
                        return t27;
                    }
                    break;
                case -1785235188:
                    if (cls.getName().equals("com.ss.android.legoapi.IAccountInitializerTaskApi")) {
                        T t28 = (T) new AccountInitializerTaskImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.legoapi.IAccountInitializerTaskApi", t28);
                        return t28;
                    }
                    break;
                case -1775773808:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo")) {
                        T t29 = (T) new SettingRequestExtraInfoImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo", t29);
                        return t29;
                    }
                    break;
                case -1772026996:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.crossplatform.ICrossPlatformService")) {
                        T t30 = (T) new CrossPlatformServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.crossplatform.ICrossPlatformService", t30);
                        return t30;
                    }
                    break;
                case -1764545303:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache")) {
                        T t31 = (T) new LowResolutionImageCache();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache", t31);
                        return t31;
                    }
                    break;
                case -1760828615:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService")) {
                        T t32 = (T) new PrivateAccountServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService", t32);
                        return t32;
                    }
                    break;
                case -1750338964:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService")) {
                        T t33 = (T) new KidsAccountServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService", t33);
                        return t33;
                    }
                    break;
                case -1738919615:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService")) {
                        T t34 = (T) new CommercializeAdServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService", t34);
                        return t34;
                    }
                    break;
                case -1733011232:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService")) {
                        T t35 = (T) new ChildModeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService", t35);
                        return t35;
                    }
                    break;
                case -1727161271:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService")) {
                        T t36 = (T) new SmartFeedPreloadServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService", t36);
                        return t36;
                    }
                    break;
                case -1722434065:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.social.monitor.IRelationMonitorService")) {
                        T t37 = (T) new RelationMonitorServiceImp();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.social.monitor.IRelationMonitorService", t37);
                        return t37;
                    }
                    break;
                case -1718043654:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService")) {
                        T t38 = (T) new ComplianceDependServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService", t38);
                        return t38;
                    }
                    break;
                case -1690323830:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.deeplink.IDeepLinkService")) {
                        T t39 = (T) new DeepLinkServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.deeplink.IDeepLinkService", t39);
                        return t39;
                    }
                    break;
                case -1667865087:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLCommonService")) {
                        T t40 = (T) new MLCommonServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.api.IMLCommonService", t40);
                        return t40;
                    }
                    break;
                case -1643932385:
                    if (cls.getName().equals("com.ss.android.common.util.INetWorkInject")) {
                        T t41 = (T) new NetWorkInjectImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.common.util.INetWorkInject", t41);
                        return t41;
                    }
                    break;
                case -1643547945:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService")) {
                        T t42 = (T) new ProtectionServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService", t42);
                        return t42;
                    }
                    break;
                case -1633603100:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service")) {
                        T t43 = (T) new SmartPreloadCommentV2ServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service", t43);
                        return t43;
                    }
                    break;
                case -1632619980:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISettingDependService")) {
                        T t44 = (T) new SettingDependServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.services.ISettingDependService", t44);
                        return t44;
                    }
                    break;
                case -1614697299:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountService")) {
                        T t45 = (T) new AccountService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IAccountService", t45);
                        return t45;
                    }
                    break;
                case -1610244269:
                    if (cls.getName().equals("com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService")) {
                        T t46 = (T) new IMCoreProxyService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService", t46);
                        return t46;
                    }
                    break;
                case -1609011523:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService")) {
                        T t47 = (T) new QAInvitationService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService", t47);
                        return t47;
                    }
                    break;
                case -1595397874:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IQnaService")) {
                        return (T) new QnaService();
                    }
                    break;
                case -1581692065:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.service.IIMunder16Proxy")) {
                        T t48 = (T) new IMUnder16ProxyImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.im.service.IIMunder16Proxy", t48);
                        return t48;
                    }
                    break;
                case -1558198493:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService")) {
                        T t49 = (T) new FamilyPairingServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService", t49);
                        return t49;
                    }
                    break;
                case -1555262497:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.api.IZeroRatingService")) {
                        T t50 = (T) new ZeroRatingServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.api.IZeroRatingService", t50);
                        return t50;
                    }
                    break;
                case -1553253226:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend")) {
                        T t51 = (T) new AdTrackDependImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend", t51);
                        return t51;
                    }
                    break;
                case -1544248582:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService")) {
                        T t52 = (T) new ECommerceLiveBridgeMethodServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService", t52);
                        return t52;
                    }
                    break;
                case -1527643984:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService")) {
                        T t53 = (T) new Feed0VVManagerService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService", t53);
                        return t53;
                    }
                    break;
                case -1517460377:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.awemeservice.api.IAwemeService")) {
                        T t54 = (T) new AwemeService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.awemeservice.api.IAwemeService", t54);
                        return t54;
                    }
                    break;
                case -1512127072:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareExtService")) {
                        T t55 = (T) new ShareExtServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.share.ShareExtService", t55);
                        return t55;
                    }
                    break;
                case -1510438058:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService")) {
                        T t56 = (T) new ImEntranceService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService", t56);
                        return t56;
                    }
                    break;
                case -1509395635:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService")) {
                        T t57 = (T) new TermsConsentServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService", t57);
                        return t57;
                    }
                    break;
                case -1498800717:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.IAbTestManager")) {
                        T t58 = (T) new AbTestManagerImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.IAbTestManager", t58);
                        return t58;
                    }
                    break;
                case -1494693547:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.download.component_api.service.IDownloadService")) {
                        T t59 = (T) new DownloadServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.download.component_api.service.IDownloadService", t59);
                        return t59;
                    }
                    break;
                case -1484563773:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IDownloadService")) {
                        T t60 = (T) new DownloadService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.app.services.IDownloadService", t60);
                        return t60;
                    }
                    break;
                case -1459016104:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper")) {
                        T t61 = (T) new SchemaPageHelperImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper", t61);
                        return t61;
                    }
                    break;
                case -1441338863:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.RedPointService")) {
                        T t62 = (T) new RedPointServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.count.RedPointService", t62);
                        return t62;
                    }
                    break;
                case -1437674684:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService")) {
                        T t63 = (T) new RequestIdService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService", t63);
                        return t63;
                    }
                    break;
                case -1419081718:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.RecommendUserService")) {
                        T t64 = (T) new RecommendUserServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.recommend.users.RecommendUserService", t64);
                        return t64;
                    }
                    break;
                case -1408415368:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.specact.api.ISpecActService")) {
                        T t65 = (T) new SpecActServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.specact.api.ISpecActService", t65);
                        return t65;
                    }
                    break;
                case -1403714223:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEventCenter")) {
                        T t66 = (T) new EventCenter();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ecommerce.service.IEventCenter", t66);
                        return t66;
                    }
                    break;
                case -1396670568:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.II18nService")) {
                        T t67 = (T) new I18nService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.main.service.II18nService", t67);
                        return t67;
                    }
                    break;
                case -1379566319:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService")) {
                        T t68 = (T) new SmartMLSceneServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService", t68);
                        return t68;
                    }
                    break;
                case -1379065367:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareService")) {
                        T t69 = (T) new ShareServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.share.ShareService", t69);
                        return t69;
                    }
                    break;
                case -1365640136:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting")) {
                        T t70 = (T) new VEEncodingImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting", t70);
                        return t70;
                    }
                    break;
                case -1340720349:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.social.service.IRelationExtService")) {
                        T t71 = (T) new RelationExtService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.social.service.IRelationExtService", t71);
                        return t71;
                    }
                    break;
                case -1289181594:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService")) {
                        T t72 = (T) new SmartPlaytimePredictServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService", t72);
                        return t72;
                    }
                    break;
                case -1263811427:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService")) {
                        T t73 = (T) new SmartFeedLoadMoreServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService", t73);
                        return t73;
                    }
                    break;
                case -1259244187:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.mix.api.IDetailMixOperatorService")) {
                        T t74 = (T) new DetailMixOperatorServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.mix.api.IDetailMixOperatorService", t74);
                        return t74;
                    }
                    break;
                case -1251125540:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService")) {
                        return (T) new CommonFeedLaunchServiceImpl();
                    }
                    break;
                case -1228033401:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IAVCommentService")) {
                        T t75 = (T) new AVCommentServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.internal.IAVCommentService", t75);
                        return t75;
                    }
                    break;
                case -1225060392:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IActivityRouterService")) {
                        T t76 = (T) new ActivityRouterServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IActivityRouterService", t76);
                        return t76;
                    }
                    break;
                case -1217333837:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy")) {
                        T t77 = (T) new DmNoticeProxyImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy", t77);
                        return t77;
                    }
                    break;
                case -1195195007:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.IAdCardService")) {
                        T t78 = (T) new AdCardServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.IAdCardService", t78);
                        return t78;
                    }
                    break;
                case -1195178446:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.net.IReleaseInterceptor")) {
                        T t79 = (T) new DevicesNullInterceptor();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.net.IReleaseInterceptor", t79);
                        return t79;
                    }
                    break;
                case -1181313806:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi")) {
                        T t80 = (T) new NewUserImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi", t80);
                        return t80;
                    }
                    break;
                case -1175770854:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.dsp.service.IMusicDspService")) {
                        T t81 = (T) new MusicDspServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.dsp.service.IMusicDspService", t81);
                        return t81;
                    }
                    break;
                case -1175242813:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.social.service.IRelationComService")) {
                        T t82 = (T) new RelationComService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.social.service.IRelationComService", t82);
                        return t82;
                    }
                    break;
                case -1155118267:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IApiGuardService")) {
                        T t83 = (T) new ApiGuardService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IApiGuardService", t83);
                        return t83;
                    }
                    break;
                case -1154900743:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService")) {
                        return (T) new AdLandPageDependOutService();
                    }
                    break;
                case -1139302695:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.service.ICommerceService")) {
                        T t84 = (T) new CommerceService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commerce.service.ICommerceService", t84);
                        return t84;
                    }
                    break;
                case -1058542172:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider")) {
                        T t85 = (T) new ChallengeDetailProvicer();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider", t85);
                        return t85;
                    }
                    break;
                case -1039515171:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.userservice.api.IUserService")) {
                        T t86 = (T) new UserService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.userservice.api.IUserService", t86);
                        return t86;
                    }
                    break;
                case -1037175629:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.comment.services.CommentService")) {
                        T t87 = (T) new CommentServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.comment.services.CommentService", t87);
                        return t87;
                    }
                    break;
                case -1034497889:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend")) {
                        T t88 = (T) new AdRouterHandlerDependImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend", t88);
                        return t88;
                    }
                    break;
                case -1021402751:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.net.InterceptorProvider")) {
                        T t89 = (T) new InterceptorHolder();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.net.InterceptorProvider", t89);
                        return t89;
                    }
                    break;
                case -1015551078:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFollowFeedService")) {
                        T t90 = (T) new FollowFeedServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.service.IFollowFeedService", t90);
                        return t90;
                    }
                    break;
                case -978906707:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService")) {
                        T t91 = (T) new SmartRegressCalculateServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService", t91);
                        return t91;
                    }
                    break;
                case -977842286:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IShareService")) {
                        T t92 = (T) new com.ss.android.ugc.aweme.internal.ShareServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.internal.IShareService", t92);
                        return t92;
                    }
                    break;
                case -955482181:
                    if (cls.getName().equals("com.ss.android.legoapi.ISysOptTaskApi")) {
                        T t93 = (T) new SysOptTaskImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.legoapi.ISysOptTaskApi", t93);
                        return t93;
                    }
                    break;
                case -935773963:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService")) {
                        T t94 = (T) new CommonFeedApiService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService", t94);
                        return t94;
                    }
                    break;
                case -927795034:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IStorageManagerService")) {
                        return (T) new StorageManagerService();
                    }
                    break;
                case -921805160:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.LogHelper")) {
                        T t95 = (T) new LogHelperImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.helper.LogHelper", t95);
                        return t95;
                    }
                    break;
                case -920387194:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.bullet.api.IBulletService")) {
                        T t96 = (T) new BulletService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.bullet.api.IBulletService", t96);
                        return t96;
                    }
                    break;
                case -920282637:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService")) {
                        T t97 = (T) new RuntimeBehaviorServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService", t97);
                        return t97;
                    }
                    break;
                case -915558489:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IPropReuseService")) {
                        T t98 = (T) new PropReuseServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.tools.detail.IPropReuseService", t98);
                        return t98;
                    }
                    break;
                case -884425869:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicService")) {
                        T t99 = (T) new MusicService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.music.service.IMusicService", t99);
                        return t99;
                    }
                    break;
                case -883042393:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService")) {
                        T t100 = (T) new EditVideoInfoServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService", t100);
                        return t100;
                    }
                    break;
                case -875578063:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.secapi.ISecApi")) {
                        T t101 = (T) new SecApiImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.secapi.ISecApi", t101);
                        return t101;
                    }
                    break;
                case -875547947:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAppWidgetService")) {
                        T t102 = (T) new AppWidgetServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IAppWidgetService", t102);
                        return t102;
                    }
                    break;
                case -871727766:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.utils.LanguageProvider")) {
                        T t103 = (T) new LanguageService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.utils.LanguageProvider", t103);
                        return t103;
                    }
                    break;
                case -847616942:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IEOYService")) {
                        T t104 = (T) new EOYServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.service.IEOYService", t104);
                        return t104;
                    }
                    break;
                case -847459216:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi")) {
                        T t105 = (T) new GodzillaImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi", t105);
                        return t105;
                    }
                    break;
                case -801228301:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IShowInviteUserListService")) {
                        T t106 = (T) new InviteUseListService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.friends.service.IShowInviteUserListService", t106);
                        return t106;
                    }
                    break;
                case -797912089:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.service.IIMService")) {
                        T t107 = (T) new IMService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.im.service.IIMService", t107);
                        return t107;
                    }
                    break;
                case -790607001:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ug.IUgCommonService")) {
                        T t108 = (T) new UgCommonServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ug.IUgCommonService", t108);
                        return t108;
                    }
                    break;
                case -781406739:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService")) {
                        return (T) new CommerceStickerServiceImpl();
                    }
                    break;
                case -768296629:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService")) {
                        T t109 = (T) new KidsWellbeingServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService", t109);
                        return t109;
                    }
                    break;
                case -760523568:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.PerformanceMainService")) {
                        T t110 = (T) new PerformanceMainServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.PerformanceMainService", t110);
                        return t110;
                    }
                    break;
                case -757369727:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.draft.model.DraftUpdateService")) {
                        T t111 = (T) new DraftUpdateServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.draft.model.DraftUpdateService", t111);
                        return t111;
                    }
                    break;
                case -751273669:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.IAdCardOutService")) {
                        return (T) new AdCardOutService();
                    }
                    break;
                case -750502703:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkInitService")) {
                        T t112 = (T) new BenchmarkInitService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.bl.IBenchmarkInitService", t112);
                        return t112;
                    }
                    break;
                case -738010642:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IPoiService")) {
                        T t113 = (T) new PoiServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.poi_api.service.IPoiService", t113);
                        return t113;
                    }
                    break;
                case -728326428:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAvSearchUserService")) {
                        T t114 = (T) new AvSearchUserServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.port.in.IAvSearchUserService", t114);
                        return t114;
                    }
                    break;
                case -727390069:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feed.cache.IFeedApi")) {
                        return (T) new FeedApiService();
                    }
                    break;
                case -724947689:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.story.IStoryPublishService")) {
                        T t115 = (T) new StoryPublishServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.story.IStoryPublishService", t115);
                        return t115;
                    }
                    break;
                case -713308800:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IHybridABInfoService")) {
                        T t116 = (T) new HybridABInfoService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.app.services.IHybridABInfoService", t116);
                        return t116;
                    }
                    break;
                case -707368300:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IFestivalService")) {
                        return (T) new FestivalService();
                    }
                    break;
                case -706380519:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAVMixFeedService")) {
                        T t117 = (T) new IAVMixFeedServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.port.in.IAVMixFeedService", t117);
                        return t117;
                    }
                    break;
                case -688908617:
                    if (cls.getName().equals("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService")) {
                        T t118 = (T) new DeeplinkPrefetchImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService", t118);
                        return t118;
                    }
                    break;
                case -687432460:
                    if (cls.getName().equals("com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory")) {
                        T t119 = (T) new EditRootSceneFactoryDelegate();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory", t119);
                        return t119;
                    }
                    break;
                case -679535832:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.IServerPortraitService")) {
                        T t120 = (T) new ServerPortraitCollections();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.requestcombine.IServerPortraitService", t120);
                        return t120;
                    }
                    break;
                case -679339171:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IUIUXBugsExperimentService")) {
                        T t121 = (T) new UIUXBugsExperimentService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IUIUXBugsExperimentService", t121);
                        return t121;
                    }
                    break;
                case -676259965:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider")) {
                        T t122 = (T) new NetworkConfigProvider();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider", t122);
                        return t122;
                    }
                    break;
                case -653943499:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService")) {
                        T t123 = (T) new LegacyCommercializeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService", t123);
                        return t123;
                    }
                    break;
                case -643691779:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService")) {
                        T t124 = (T) new UserInfoUpdateAdapterService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService", t124);
                        return t124;
                    }
                    break;
                case -642110915:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.function.IFunctionSupportService")) {
                        T t125 = (T) new FunctionSupportServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.function.IFunctionSupportService", t125);
                        return t125;
                    }
                    break;
                case -628620472:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService")) {
                        T t126 = (T) new SmartClassifyServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService", t126);
                        return t126;
                    }
                    break;
                case -607424883:
                    if (cls.getName().equals("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService")) {
                        T t127 = (T) new CustomActivityOnCrashServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService", t127);
                        return t127;
                    }
                    break;
                case -603851576:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IContactService")) {
                        T t128 = (T) new ContactServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.friends.service.IContactService", t128);
                        return t128;
                    }
                    break;
                case -582786788:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.journey.INewUserMainModuleService")) {
                        T t129 = (T) new NewUserMainModuleService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.journey.INewUserMainModuleService", t129);
                        return t129;
                    }
                    break;
                case -572575565:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.edit.IReplaceMusicService")) {
                        T t130 = (T) new ReplaceMusicServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.edit.IReplaceMusicService", t130);
                        return t130;
                    }
                    break;
                case -553887713:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService")) {
                        T t131 = (T) new RecommendFeedServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService", t131);
                        return t131;
                    }
                    break;
                case -550872997:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper")) {
                        T t132 = (T) new MainServiceHelperImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper", t132);
                        return t132;
                    }
                    break;
                case -544454424:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService")) {
                        return (T) new MainFragmentCacheExpServiceImpl();
                    }
                    break;
                case -537976318:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IPreLoginHandleService")) {
                        T t133 = (T) new PreLoginHandleService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IPreLoginHandleService", t133);
                        return t133;
                    }
                    break;
                case -470712021:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IProfileNaviService")) {
                        T t134 = (T) new ProfileNaviServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IProfileNaviService", t134);
                        return t134;
                    }
                    break;
                case -469570464:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper")) {
                        T t135 = (T) new FollowTabBubbleGuideHelperImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper", t135);
                        return t135;
                    }
                    break;
                case -451157663:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider")) {
                        T t136 = (T) new MixActivityContainerProvider();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider", t136);
                        return t136;
                    }
                    break;
                case -413830924:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService")) {
                        T t137 = (T) new SplitVideoServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService", t137);
                        return t137;
                    }
                    break;
                case -405727142:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService")) {
                        T t138 = (T) new CommentStickerRecordServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService", t138);
                        return t138;
                    }
                    break;
                case -401510911:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService")) {
                        T t139 = (T) new SmartFeedAdUIServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService", t139);
                        return t139;
                    }
                    break;
                case -401450704:
                    if (cls.getName().equals("com.ss.android.legoapi.abtest.IABLegoTaskApi")) {
                        T t140 = (T) new ABLegoTaskImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.legoapi.abtest.IABLegoTaskApi", t140);
                        return t140;
                    }
                    break;
                case -381018931:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoveryService")) {
                        T t141 = (T) new DiscoveryServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.discover.IDiscoveryService", t141);
                        return t141;
                    }
                    break;
                case -360388275:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService")) {
                        T t142 = (T) new MLDataCenterServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService", t142);
                        return t142;
                    }
                    break;
                case -343801484:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.search.service.ISearchUserService")) {
                        T t143 = (T) new SearchUserService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.search.service.ISearchUserService", t143);
                        return t143;
                    }
                    break;
                case -338797404:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.watermark.IWaterMarkService")) {
                        T t144 = (T) new WaterMarkServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.watermark.IWaterMarkService", t144);
                        return t144;
                    }
                    break;
                case -336112860:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService")) {
                        T t145 = (T) new ComplianceBusinessServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService", t145);
                        return t145;
                    }
                    break;
                case -317372455:
                    if (cls.getName().equals("com.ss.android.ugc.tiktok.seclink.ISecLinkService")) {
                        T t146 = (T) new SecLinkServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.tiktok.seclink.ISecLinkService", t146);
                        return t146;
                    }
                    break;
                case -316841472:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService")) {
                        T t147 = (T) new ShoutoutsReviewService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService", t147);
                        return t147;
                    }
                    break;
                case -315654493:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService")) {
                        T t148 = (T) new FTCServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService", t148);
                        return t148;
                    }
                    break;
                case -307992734:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicDetailService")) {
                        T t149 = (T) new MusicDetailService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.music.service.IMusicDetailService", t149);
                        return t149;
                    }
                    break;
                case -296051311:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.ISettingManagerService")) {
                        T t150 = (T) new SettingManagerServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.ISettingManagerService", t150);
                        return t150;
                    }
                    break;
                case -265816009:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy")) {
                        T t151 = (T) new BulletHostProxy();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy", t151);
                        return t151;
                    }
                    break;
                case -249931293:
                    if (cls.getName().equals("com.ss.android.sdk.webview.di.IMainServiceForJsb")) {
                        T t152 = (T) new MainServiceForJsb();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.sdk.webview.di.IMainServiceForJsb", t152);
                        return t152;
                    }
                    break;
                case -242240457:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IReplaceMusicDownloadService")) {
                        T t153 = (T) new ReplaceMusicDownloadService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IReplaceMusicDownloadService", t153);
                        return t153;
                    }
                    break;
                case -228631819:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.ab.NoticeABService")) {
                        T t154 = (T) new NoticeABServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.ab.NoticeABService", t154);
                        return t154;
                    }
                    break;
                case -219610361:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.IStickerViewService")) {
                        T t155 = (T) new StickerViewServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.sticker.IStickerViewService", t155);
                        return t155;
                    }
                    break;
                case -206316949:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareFlavorService")) {
                        T t156 = (T) new ShareFlavorServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.share.ShareFlavorService", t156);
                        return t156;
                    }
                    break;
                case -188045946:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.abmock.IKidsAbMockService")) {
                        T t157 = (T) new KidsRegisterMockImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.api.abmock.IKidsAbMockService", t157);
                        return t157;
                    }
                    break;
                case -184461633:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tcm.api.service.ITcmService")) {
                        return (T) new TcmServiceImpl();
                    }
                    break;
                case -141121201:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerOutService")) {
                        return (T) new CommerceStickerOutService();
                    }
                    break;
                case -138974023:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.IRetrofitFactory")) {
                        T t158 = (T) new RetrofitFactory();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.aweme.network.IRetrofitFactory", t158);
                        return t158;
                    }
                    break;
                case -132128589:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeService")) {
                        T t159 = (T) new ChallengeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.challenge.service.IChallengeService", t159);
                        return t159;
                    }
                    break;
                case -130657778:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.AVApi")) {
                        return (T) new AVApiImpl();
                    }
                    break;
                case -123206016:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISettingService")) {
                        T t160 = (T) new SettingServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.services.ISettingService", t160);
                        return t160;
                    }
                    break;
                case -115845173:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAVServiceProxy")) {
                        T t161 = (T) new AVServiceProxyImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.IAVServiceProxy", t161);
                        return t161;
                    }
                    break;
                case -77732678:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService")) {
                        T t162 = (T) new TpcConsentServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService", t162);
                        return t162;
                    }
                    break;
                case -66305606:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen")) {
                        T t163 = (T) new AdLightWebPageOpenUtils();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen", t163);
                        return t163;
                    }
                    break;
                case -58960682:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi")) {
                        T t164 = (T) new CrashSdkImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi", t164);
                        return t164;
                    }
                    break;
                case -56944482:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.ILanguageService")) {
                        T t165 = (T) new com.ss.android.ugc.aweme.setting.services.LanguageService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.main.service.ILanguageService", t165);
                        return t165;
                    }
                    break;
                case -45175540:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService")) {
                        return (T) new InferenceEngineServiceImpl();
                    }
                    break;
                case -15737757:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.locale.ILocalService")) {
                        T t166 = (T) new LocalServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.locale.ILocalService", t166);
                        return t166;
                    }
                    break;
                case 8583776:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.social.widget.card.ISocialCardService")) {
                        T t167 = (T) new SocialCardServiceImp();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.social.widget.card.ISocialCardService", t167);
                        return t167;
                    }
                    break;
                case 23310771:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IFriendsService")) {
                        T t168 = (T) new FriendsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.friends.service.IFriendsService", t168);
                        return t168;
                    }
                    break;
                case 31921668:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.favorites.service.IFavoriteService")) {
                        T t169 = (T) new FavoriteServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.favorites.service.IFavoriteService", t169);
                        return t169;
                    }
                    break;
                case 42826893:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IWebViewTweaker")) {
                        T t170 = (T) new WebViewTweakerService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.framework.services.IWebViewTweaker", t170);
                        return t170;
                    }
                    break;
                case 53902533:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.upvote.service.IUpvoteService")) {
                        T t171 = (T) new UpvoteServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.upvote.service.IUpvoteService", t171);
                        return t171;
                    }
                    break;
                case 57780698:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service")) {
                        T t172 = (T) new SmartPreloadProfileV2ServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service", t172);
                        return t172;
                    }
                    break;
                case 78503464:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IDuetDownloadService")) {
                        T t173 = (T) new DuetDownloadService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IDuetDownloadService", t173);
                        return t173;
                    }
                    break;
                case 87343796:
                    if (cls.getName().equals("com.benchmark.IBTCHConfiguration")) {
                        T t174 = (T) new BTCHConfigurationImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.benchmark.IBTCHConfiguration", t174);
                        return t174;
                    }
                    break;
                case 118052236:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IShoutOutApiService")) {
                        T t175 = (T) new ShoutOutServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.internal.IShoutOutApiService", t175);
                        return t175;
                    }
                    break;
                case 120575931:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.ICommerceService")) {
                        T t176 = (T) new CommerceServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.main.service.ICommerceService", t176);
                        return t176;
                    }
                    break;
                case 128063043:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService")) {
                        T t177 = (T) new AntiAddictionServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService", t177);
                        return t177;
                    }
                    break;
                case 129889384:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IVEABService")) {
                        T t178 = (T) new VEABServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.IVEABService", t178);
                        return t178;
                    }
                    break;
                case 154527039:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi")) {
                        return (T) new MobLaunchImpl();
                    }
                    break;
                case 163017647:
                    if (cls.getName().equals("com.ss.android.ugc.awemepushapi.IPushApi")) {
                        return (T) new PushService();
                    }
                    break;
                case 169684431:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeOutService")) {
                        return (T) new CommerceChallengeOutService();
                    }
                    break;
                case 180595487:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IPreloadApiService")) {
                        T t179 = (T) new PreloadApiServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IPreloadApiService", t179);
                        return t179;
                    }
                    break;
                case 182098267:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory")) {
                        T t180 = (T) new EffectPlatformFactory();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory", t180);
                        return t180;
                    }
                    break;
                case 182296402:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IPrivacySettingService")) {
                        T t181 = (T) new PrivacySettingService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.services.IPrivacySettingService", t181);
                        return t181;
                    }
                    break;
                case 189816622:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService")) {
                        T t182 = (T) new AuthorizeCommonService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService", t182);
                        return t182;
                    }
                    break;
                case 193978339:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService")) {
                        T t183 = (T) new AgeGateServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService", t183);
                        return t183;
                    }
                    break;
                case 197343978:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.mix.services.IMixFeedService")) {
                        return (T) new MixFeedService();
                    }
                    break;
                case 206207455:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService")) {
                        T t184 = (T) new ECommerceRNToLynxConfigService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService", t184);
                        return t184;
                    }
                    break;
                case 207468481:
                    if (cls.getName().equals("com.bytedance.ies.powerlist.IPowerContext")) {
                        T t185 = (T) new PowerContextImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.powerlist.IPowerContext", t185);
                        return t185;
                    }
                    break;
                case 220135637:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IRetrofitService")) {
                        T t186 = (T) new RetrofitService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.framework.services.IRetrofitService", t186);
                        return t186;
                    }
                    break;
                case 249088543:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance")) {
                        T t187 = (T) new KidsMusicEntrance();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance", t187);
                        return t187;
                    }
                    break;
                case 271148800:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IMandatoryLoginService")) {
                        T t188 = (T) new MandatoryLoginService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IMandatoryLoginService", t188);
                        return t188;
                    }
                    break;
                case 294068060:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareH5Service")) {
                        T t189 = (T) new ShareH5ServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.share.ShareH5Service", t189);
                        return t189;
                    }
                    break;
                case 316475372:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.story.IStoryService")) {
                        T t190 = (T) new StoryServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.story.IStoryService", t190);
                        return t190;
                    }
                    break;
                case 355979482:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountInitializer")) {
                        T t191 = (T) new AccountInitializer();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IAccountInitializer", t191);
                        return t191;
                    }
                    break;
                case 361159208:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.web.IGeckoXClientManager")) {
                        T t192 = (T) new GeckoXClientManager();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.web.IGeckoXClientManager", t192);
                        return t192;
                    }
                    break;
                case 389511774:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.poi_map.service.IPoiMapService")) {
                        T t193 = (T) new PoiMapServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.poi_map.service.IPoiMapService", t193);
                        return t193;
                    }
                    break;
                case 394604807:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.net.INetReleaseInterceptor")) {
                        return (T) new NetWorkSpeedInterceptor();
                    }
                    break;
                case 403114353:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService")) {
                        T t194 = (T) new SearchAdServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService", t194);
                        return t194;
                    }
                    break;
                case 404162146:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics")) {
                        T t195 = (T) new SearchResultStatisticsImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics", t195);
                        return t195;
                    }
                    break;
                case 438431874:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.hitrank.IRankHelperService")) {
                        T t196 = (T) new RankHelperServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.discover.hitrank.IRankHelperService", t196);
                        return t196;
                    }
                    break;
                case 453717049:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager")) {
                        T t197 = (T) new ReportAwemeManager();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager", t197);
                        return t197;
                    }
                    break;
                case 470426976:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil")) {
                        T t198 = (T) new PrivacyDisclaimerUtilService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil", t198);
                        return t198;
                    }
                    break;
                case 480277125:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoverAllService")) {
                        T t199 = (T) new DiscoverAllServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.discover.IDiscoverAllService", t199);
                        return t199;
                    }
                    break;
                case 493767622:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService")) {
                        return (T) new CommerceMediaOutService();
                    }
                    break;
                case 501025197:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IExternalService")) {
                        T t200 = (T) new AVExternalServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.IExternalService", t200);
                        return t200;
                    }
                    break;
                case 509545079:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker")) {
                        T t201 = (T) new VideoLengthChecker();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker", t201);
                        return t201;
                    }
                    break;
                case 516119261:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareDependService")) {
                        T t202 = (T) new ShareDependServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.share.ShareDependService", t202);
                        return t202;
                    }
                    break;
                case 524921666:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.DetailFeedService")) {
                        T t203 = (T) new DetailFeedServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.DetailFeedService", t203);
                        return t203;
                    }
                    break;
                case 527997931:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend")) {
                        T t204 = (T) new AdCommentDependImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend", t204);
                        return t204;
                    }
                    break;
                case 531388658:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi")) {
                        T t205 = (T) new AppsflyerImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi", t205);
                        return t205;
                    }
                    break;
                case 535970203:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.sticker.ICaptionService")) {
                        T t206 = (T) new CaptionServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.sticker.ICaptionService", t206);
                        return t206;
                    }
                    break;
                case 540084577:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IDuetDetailService")) {
                        T t207 = (T) new DuetDetailServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.tools.detail.IDuetDetailService", t207);
                        return t207;
                    }
                    break;
                case 574732927:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService")) {
                        T t208 = (T) new com.ss.android.ugc.aweme.kids.discovery.DiscoveryServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService", t208);
                        return t208;
                    }
                    break;
                case 587542919:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService")) {
                        T t209 = (T) new ChallengeDetailServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService", t209);
                        return t209;
                    }
                    break;
                case 596657451:
                    if (cls.getName().equals("com.bytedance.ies.ugc.appcontext.AppBuildConfig")) {
                        T t210 = (T) new AwemeAppBuildConfig();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.appcontext.AppBuildConfig", t210);
                        return t210;
                    }
                    break;
                case 602001356:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService")) {
                        T t211 = (T) new StrategyService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService", t211);
                        return t211;
                    }
                    break;
                case 607980095:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IGuestModeService")) {
                        T t212 = (T) new GuestModeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IGuestModeService", t212);
                        return t212;
                    }
                    break;
                case 612752120:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService")) {
                        T t213 = (T) new ContentLanguageServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService", t213);
                        return t213;
                    }
                    break;
                case 628686499:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter")) {
                        T t214 = (T) new NoticeLiveServiceAdapterImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter", t214);
                        return t214;
                    }
                    break;
                case 631540268:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.IAdCommentService")) {
                        T t215 = (T) new AdCommentService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ad.comment.IAdCommentService", t215);
                        return t215;
                    }
                    break;
                case 634505157:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.report.IReportService")) {
                        T t216 = (T) new ReportServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.report.IReportService", t216);
                        return t216;
                    }
                    break;
                case 647695418:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService")) {
                        T t217 = (T) new NoticeCommentHelperServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService", t217);
                        return t217;
                    }
                    break;
                case 657562595:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.NoticeCountService")) {
                        T t218 = (T) new NoticeCountServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.count.NoticeCountService", t218);
                        return t218;
                    }
                    break;
                case 669378360:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount")) {
                        T t219 = (T) new ApiNetworkServiceForAccount();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount", t219);
                        return t219;
                    }
                    break;
                case 674144051:
                    if (cls.getName().equals("com.ss.android.legoapi.freso.IFrescoLegoTaskApi")) {
                        T t220 = (T) new FrescoLegoTaskImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.legoapi.freso.IFrescoLegoTaskApi", t220);
                        return t220;
                    }
                    break;
                case 696264772:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageShareVMService")) {
                        T t221 = (T) new StorySidebarOperatorServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IDetailPageShareVMService", t221);
                        return t221;
                    }
                    break;
                case 698926204:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService")) {
                        return (T) new IRecommendUsersServiceImpl();
                    }
                    break;
                case 707572774:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService")) {
                        T t222 = (T) new KidsCommonServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService", t222);
                        return t222;
                    }
                    break;
                case 712413375:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IBuildConfigAllService")) {
                        T t223 = (T) new BuildConfigAllServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IBuildConfigAllService", t223);
                        return t223;
                    }
                    break;
                case 712436972:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.IStickerService")) {
                        T t224 = (T) new StickerServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.sticker.IStickerService", t224);
                        return t224;
                    }
                    break;
                case 727340201:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.network.INetwork")) {
                        return (T) new NetworkService();
                    }
                    break;
                case 730432555:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IUgAllService")) {
                        T t225 = (T) new UgAllServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IUgAllService", t225);
                        return t225;
                    }
                    break;
                case 735010773:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider")) {
                        return (T) new HybridRegistryProvider();
                    }
                    break;
                case 736344268:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageOperatorService")) {
                        T t226 = (T) new ChallengeDetailPageOperatorServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IDetailPageOperatorService", t226);
                        return t226;
                    }
                    break;
                case 741106177:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkService")) {
                        T t227 = (T) new BenchmarkServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.bl.IBenchmarkService", t227);
                        return t227;
                    }
                    break;
                case 767497026:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService")) {
                        T t228 = (T) new com.ss.android.ugc.aweme.kids.liked.FavoriteServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService", t228);
                        return t228;
                    }
                    break;
                case 797774759:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService")) {
                        T t229 = (T) new CommerceCommonServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService", t229);
                        return t229;
                    }
                    break;
                case 834678077:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService")) {
                        T t230 = (T) new PushLaunchPageAssistantService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService", t230);
                        return t230;
                    }
                    break;
                case 844437951:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.setting.api.ISettingService")) {
                        T t231 = (T) new com.ss.android.ugc.aweme.kids.setting.SettingServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.setting.api.ISettingService", t231);
                        return t231;
                    }
                    break;
                case 856538528:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService")) {
                        T t232 = (T) new ECommerceLiveSettingsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService", t232);
                        return t232;
                    }
                    break;
                case 864194132:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.IAwemeApplicationService")) {
                        T t233 = (T) new AwemeApplicationServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.app.IAwemeApplicationService", t233);
                        return t233;
                    }
                    break;
                case 866935518:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.INoticeService")) {
                        T t234 = (T) new NoticeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.services.INoticeService", t234);
                        return t234;
                    }
                    break;
                case 895164503:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IRegionService")) {
                        T t235 = (T) new RegionService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.app.services.IRegionService", t235);
                        return t235;
                    }
                    break;
                case 897816322:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService")) {
                        T t236 = (T) new MSAdaptionService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService", t236);
                        return t236;
                    }
                    break;
                case 905737872:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService")) {
                        T t237 = (T) new AdSceneServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService", t237);
                        return t237;
                    }
                    break;
                case 913277804:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.profile.IProfileService")) {
                        return (T) new ProfileServiceImpl();
                    }
                    break;
                case 915813450:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService")) {
                        T t238 = (T) new CommerceEggServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService", t238);
                        return t238;
                    }
                    break;
                case 941303398:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.search.ISearchService")) {
                        return (T) new SearchServiceImpl();
                    }
                    break;
                case 956329375:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService")) {
                        T t239 = (T) new SplashSettingServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService", t239);
                        return t239;
                    }
                    break;
                case 958565090:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.plugin.service.IPluginService")) {
                        T t240 = (T) new AabPluginServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.aweme.plugin.service.IPluginService", t240);
                        return t240;
                    }
                    break;
                case 966494283:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService")) {
                        return (T) new ChallengeDetailProviderOutService();
                    }
                    break;
                case 988528279:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAccountHelperService")) {
                        T t241 = (T) new AccountHelperService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.IAccountHelperService", t241);
                        return t241;
                    }
                    break;
                case 997089185:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IInternalCommerceService")) {
                        T t242 = (T) new AVCommerceServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.internal.IInternalCommerceService", t242);
                        return t242;
                    }
                    break;
                case 1000535180:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.stitch.IStitchService")) {
                        T t243 = (T) new StitchServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.stitch.IStitchService", t243);
                        return t243;
                    }
                    break;
                case 1018751923:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService")) {
                        T t244 = (T) new SplashAdServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService", t244);
                        return t244;
                    }
                    break;
                case 1029031535:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService")) {
                        T t245 = (T) new TalentAdRevenueShareServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService", t245);
                        return t245;
                    }
                    break;
                case 1051676049:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IAVUIUXBugsExperimentService")) {
                        T t246 = (T) new AVUIUXBugsExperimentServiceDiff();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.internal.IAVUIUXBugsExperimentService", t246);
                        return t246;
                    }
                    break;
                case 1059333855:
                    if (cls.getName().equals("com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService")) {
                        T t247 = (T) new IMCoreDependProxyService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService", t247);
                        return t247;
                    }
                    break;
                case 1063139064:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService")) {
                        T t248 = (T) new ForwardStatisticsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService", t248);
                        return t248;
                    }
                    break;
                case 1100609238:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService")) {
                        T t249 = (T) new CommerceMediaServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService", t249);
                        return t249;
                    }
                    break;
                case 1109873977:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveHostOuterService")) {
                        T t250 = (T) new LiveHostOuterService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.live.ILiveHostOuterService", t250);
                        return t250;
                    }
                    break;
                case 1110040557:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.IIMAdapterService")) {
                        T t251 = (T) new IMAdapterServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.im.IIMAdapterService", t251);
                        return t251;
                    }
                    break;
                case 1122426817:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService")) {
                        return (T) new HomepageExperimentServiceImpl();
                    }
                    break;
                case 1141291340:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService")) {
                        T t252 = (T) new ComplianceSettingsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService", t252);
                        return t252;
                    }
                    break;
                case 1189126425:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.INonPersonalizationService")) {
                        T t253 = (T) new NonPersonalizationService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.INonPersonalizationService", t253);
                        return t253;
                    }
                    break;
                case 1205724034:
                    if (cls.getName().equals("com.bytedance.geckox.IGeckoGlobalInit")) {
                        T t254 = (T) new GeckoGlobalInitServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.geckox.IGeckoGlobalInit", t254);
                        return t254;
                    }
                    break;
                case 1215087071:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager")) {
                        return (T) new LinkTypeTagsPriorityManagerImpl();
                    }
                    break;
                case 1217320995:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAVSettingService")) {
                        T t255 = (T) new IAVSettingServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.port.in.IAVSettingService", t255);
                        return t255;
                    }
                    break;
                case 1229038214:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IAppUpdateService")) {
                        T t256 = (T) new AppUpdateService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.services.IAppUpdateService", t256);
                        return t256;
                    }
                    break;
                case 1244392291:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService")) {
                        T t257 = (T) new VPAServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService", t257);
                        return t257;
                    }
                    break;
                case 1272240335:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService")) {
                        return (T) new IRecommendUsersDependentServiceImpl();
                    }
                    break;
                case 1291617390:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.question.IQuestionFavoriteService")) {
                        T t258 = (T) new QuestionFavoriteServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.question.IQuestionFavoriteService", t258);
                        return t258;
                    }
                    break;
                case 1305629660:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner")) {
                        T t259 = (T) new ColdLaunchRequestCombinerImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner", t259);
                        return t259;
                    }
                    break;
                case 1311814595:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.turbo.api.brand.ITurboViApi")) {
                        T t260 = (T) new TurboViImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.turbo.api.brand.ITurboViApi", t260);
                        return t260;
                    }
                    break;
                case 1315153688:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService")) {
                        T t261 = (T) new NotificationCountViewManager.Companion.NotificationCountViewServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService", t261);
                        return t261;
                    }
                    break;
                case 1322940111:
                    if (cls.getName().equals("com.ss.android.ugc.musicprovider.MusicPreloaderService")) {
                        T t262 = (T) new MusicPreloaderServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.musicprovider.MusicPreloaderService", t262);
                        return t262;
                    }
                    break;
                case 1324297503:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.profile.api.IProfileService")) {
                        T t263 = (T) new com.ss.android.ugc.aweme.kids.profile.ProfileServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.profile.api.IProfileService", t263);
                        return t263;
                    }
                    break;
                case 1360758845:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IUserService")) {
                        T t264 = (T) new BaseUserService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.framework.services.IUserService", t264);
                        return t264;
                    }
                    break;
                case 1377589410:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.IPowerPreload")) {
                        T t265 = (T) new PowerPreloadServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.bytedance.ies.ugc.aweme.network.IPowerPreload", t265);
                        return t265;
                    }
                    break;
                case 1377752390:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService")) {
                        T t266 = (T) new SmartDataTrackerServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService", t266);
                        return t266;
                    }
                    break;
                case 1382041287:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.trending.service.ITrendingFeedService")) {
                        return (T) new TrendingDetailServiceImpl();
                    }
                    break;
                case 1383321717:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend")) {
                        T t267 = (T) new AdTaskDependImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend", t267);
                        return t267;
                    }
                    break;
                case 1385201501:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.utils.GsonProvider")) {
                        T t268 = (T) new GsonHolder();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.utils.GsonProvider", t268);
                        return t268;
                    }
                    break;
                case 1390520786:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggOutService")) {
                        return (T) new CommerceEggOutService();
                    }
                    break;
                case 1391445989:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.login.ILoginProxy")) {
                        T t269 = (T) new LoginProxyImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.login.ILoginProxy", t269);
                        return t269;
                    }
                    break;
                case 1423920585:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService")) {
                        return (T) new SplashAdOutService();
                    }
                    break;
                case 1439372287:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.landpage.IAdLandPageService")) {
                        T t270 = (T) new AdLandPageServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.landpage.IAdLandPageService", t270);
                        return t270;
                    }
                    break;
                case 1443402605:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.login.ILoginUtilsService")) {
                        T t271 = (T) new LoginUtilsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.login.ILoginUtilsService", t271);
                        return t271;
                    }
                    break;
                case 1453159191:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil")) {
                        T t272 = (T) new NoticeLiveWatcherUtilImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil", t272);
                        return t272;
                    }
                    break;
                case 1461013736:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.base.ImageUserService")) {
                        return (T) new ImageUserServiceImpl();
                    }
                    break;
                case 1469964205:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService")) {
                        T t273 = (T) new GeckoLocalServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService", t273);
                        return t273;
                    }
                    break;
                case 1487002875:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService")) {
                        T t274 = (T) new AdsPreviewServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService", t274);
                        return t274;
                    }
                    break;
                case 1513354211:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService")) {
                        T t275 = (T) new SmartDataCenterApiServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService", t275);
                        return t275;
                    }
                    break;
                case 1520768300:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.hybridkit.IHybridKitService")) {
                        T t276 = (T) new HybridKitTaskImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.hybridkit.IHybridKitService", t276);
                        return t276;
                    }
                    break;
                case 1538373766:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory")) {
                        T t277 = (T) new MediaChosenResultProcessFactory();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory", t277);
                        return t277;
                    }
                    break;
                case 1543209270:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.ILauncherService")) {
                        T t278 = (T) new LauncherServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.launcher.ILauncherService", t278);
                        return t278;
                    }
                    break;
                case 1545114897:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IFollowService")) {
                        T t279 = (T) new FollowService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.friends.service.IFollowService", t279);
                        return t279;
                    }
                    break;
                case 1545384024:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService")) {
                        T t280 = (T) new SettingsRequestServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService", t280);
                        return t280;
                    }
                    break;
                case 1579750757:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IVideoGiftService")) {
                        T t281 = (T) new VideoGiftService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.services.IVideoGiftService", t281);
                        return t281;
                    }
                    break;
                case 1595185874:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.account.IAccountApi")) {
                        T t282 = (T) new AccountImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.launcher.service.account.IAccountApi", t282);
                        return t282;
                    }
                    break;
                case 1636333933:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService")) {
                        T t283 = (T) new CommerceChallengeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService", t283);
                        return t283;
                    }
                    break;
                case 1648432028:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IMultiAccountService")) {
                        T t284 = (T) new MultiAccountService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IMultiAccountService", t284);
                        return t284;
                    }
                    break;
                case 1649339714:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feed.api.IFeedModuleService")) {
                        T t285 = (T) new FeedModuleServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.feed.api.IFeedModuleService", t285);
                        return t285;
                    }
                    break;
                case 1660655893:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService")) {
                        return (T) new ProfileDependentComponentImpl();
                    }
                    break;
                case 1661968864:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService")) {
                        T t286 = (T) new SmartCommonPreloadServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService", t286);
                        return t286;
                    }
                    break;
                case 1663726118:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService")) {
                        T t287 = (T) new AdLandPagePreloadServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService", t287);
                        return t287;
                    }
                    break;
                case 1674227107:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService")) {
                        T t288 = (T) new BanAppealServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService", t288);
                        return t288;
                    }
                    break;
                case 1713060419:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService")) {
                        T t289 = (T) new PrivacyServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService", t289);
                        return t289;
                    }
                    break;
                case 1723717660:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.IInitAllService")) {
                        T t290 = (T) new InitAllServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.app.IInitAllService", t290);
                        return t290;
                    }
                    break;
                case 1724321674:
                    if (cls.getName().equals("com.ss.android.ugc.gamora.TTEPPageFactory")) {
                        T t291 = (T) new TTEPPageFactoryDelegate();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.gamora.TTEPPageFactory", t291);
                        return t291;
                    }
                    break;
                case 1736159254:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IProfileBadgeService")) {
                        T t292 = (T) new ProfileBadgeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IProfileBadgeService", t292);
                        return t292;
                    }
                    break;
                case 1739791517:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IChallengeDetailLegacyService")) {
                        T t293 = (T) new ChallengeDetailLegacyServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IChallengeDetailLegacyService", t293);
                        return t293;
                    }
                    break;
                case 1765569915:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdOutService")) {
                        return (T) new CommercializeAdOutService();
                    }
                    break;
                case 1766865868:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService")) {
                        T t294 = (T) new ShoppingAdsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService", t294);
                        return t294;
                    }
                    break;
                case 1771293041:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper")) {
                        T t295 = (T) new NotificationClickHelperImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper", t295);
                        return t295;
                    }
                    break;
                case 1772993265:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveOuterService")) {
                        T t296 = (T) new LiveOuterService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.live.ILiveOuterService", t296);
                        return t296;
                    }
                    break;
                case 1784620411:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.view.IFallbackDetector")) {
                        T t297 = (T) new FallbackDetector();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ecommerce.router.view.IFallbackDetector", t297);
                        return t297;
                    }
                    break;
                case 1787636921:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService")) {
                        T t298 = (T) new PolicyNoticeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService", t298);
                        return t298;
                    }
                    break;
                case 1817711182:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IMovieReuseService")) {
                        T t299 = (T) new MovieReuseServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.tools.detail.IMovieReuseService", t299);
                        return t299;
                    }
                    break;
                case 1832868993:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IRessoAnchorService")) {
                        return (T) new IRessoAnchorServiceImpl();
                    }
                    break;
                case 1839198709:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService")) {
                        T t300 = (T) new LiveBusinessParasiticModule();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService", t300);
                        return t300;
                    }
                    break;
                case 1866297976:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IEmojiService")) {
                        T t301 = (T) new EmojiServiceImplDiff();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.port.in.IEmojiService", t301);
                        return t301;
                    }
                    break;
                case 1867130512:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService")) {
                        T t302 = (T) new ImplService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService", t302);
                        return t302;
                    }
                    break;
                case 1886330729:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IUpdateSettingService")) {
                        T t303 = (T) new UpdateSettingServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.setting.services.IUpdateSettingService", t303);
                        return t303;
                    }
                    break;
                case 1893478097:
                    if (cls.getName().equals("com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut")) {
                        T t304 = (T) new ProviderConfigOutImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut", t304);
                        return t304;
                    }
                    break;
                case 1931560400:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAgeGateService")) {
                        T t305 = (T) new AgeGateService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.IAgeGateService", t305);
                        return t305;
                    }
                    break;
                case 1932185006:
                    if (cls.getName().equals("com.ss.android.legoapi.ICrashSdkTaskApi")) {
                        T t306 = (T) new CrashSdkTaskImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.legoapi.ICrashSdkTaskApi", t306);
                        return t306;
                    }
                    break;
                case 1943814112:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IDeleteAccountService")) {
                        T t307 = (T) new DeleteAccountService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.framework.services.IDeleteAccountService", t307);
                        return t307;
                    }
                    break;
                case 1948175614:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService")) {
                        T t308 = (T) new ComplianceMonitorServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService", t308);
                        return t308;
                    }
                    break;
                case 1966483646:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.mix.IMixHelperService")) {
                        T t309 = (T) new MixHelperService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.mix.IMixHelperService", t309);
                        return t309;
                    }
                    break;
                case 1967964191:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig")) {
                        T t310 = (T) new PraiseGuideConfig();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig", t310);
                        return t310;
                    }
                    break;
                case 1970320629:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageService")) {
                        T t311 = (T) new MainPageServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.main.IMainPageService", t311);
                        return t311;
                    }
                    break;
                case 1976378617:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory")) {
                        T t312 = (T) new PublishServiceFactoryImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory", t312);
                        return t312;
                    }
                    break;
                case 1985734298:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.compliance.IKidsComplianceService")) {
                        T t313 = (T) new KidsComplianceServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.kids.compliance.IKidsComplianceService", t313);
                        return t313;
                    }
                    break;
                case 2019274645:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService")) {
                        T t314 = (T) new CommercializeFeedServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService", t314);
                        return t314;
                    }
                    break;
                case 2020500036:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.WSHelper")) {
                        T t315 = (T) new WSHelperImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.notice.api.helper.WSHelper", t315);
                        return t315;
                    }
                    break;
                case 2023609189:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService")) {
                        T t316 = (T) new MiniAppDependServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService", t316);
                        return t316;
                    }
                    break;
                case 2037829402:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.IQRCodeService")) {
                        T t317 = (T) new QRCodeServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.qrcode.IQRCodeService", t317);
                        return t317;
                    }
                    break;
                case 2046591221:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessComponentService")) {
                        T t318 = (T) new BusinessComponentServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.IBusinessComponentService", t318);
                        return t318;
                    }
                    break;
                case 2050400656:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAVInitializer")) {
                        T t319 = (T) new AVInitializerImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.services.IAVInitializer", t319);
                        return t319;
                    }
                    break;
                case 2059590346:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService")) {
                        T t320 = (T) new FollowStatisticsServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService", t320);
                        return t320;
                    }
                    break;
                case 2070608616:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService")) {
                        return (T) new QrCodeScanImpl();
                    }
                    break;
                case 2075319920:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.comment.ICommentFavoriteService")) {
                        T t321 = (T) new CommentFavoriteServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.comment.ICommentFavoriteService", t321);
                        return t321;
                    }
                    break;
                case 2086113417:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.sharer.IChannelApi")) {
                        T t322 = (T) new InstagramStoryChannelService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.sharer.IChannelApi", t322);
                        return t322;
                    }
                    break;
                case 2086698121:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ICQrcodeService")) {
                        T t323 = (T) new CQrcodeService();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.ICQrcodeService", t323);
                        return t323;
                    }
                    break;
                case 2098328820:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService")) {
                        T t324 = (T) new HomePageUIFrameServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService", t324);
                        return t324;
                    }
                    break;
                case 2116238537:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IPrivacyService")) {
                        T t325 = (T) new com.ss.android.ugc.aweme.internal.PrivacyServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.internal.IPrivacyService", t325);
                        return t325;
                    }
                    break;
                case 2118728194:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.captcha.util.ICaptchaHelperService")) {
                        T t326 = (T) new CaptchaHelperServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.captcha.util.ICaptchaHelperService", t326);
                        return t326;
                    }
                    break;
                case 2128592722:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.donation.IDonationService")) {
                        T t327 = (T) new DonationServiceImpl();
                        staticServiceImplManager.invokeAccessputStaticServiceImplCache_("com.ss.android.ugc.aweme.donation.IDonationService", t327);
                        return t327;
                    }
                    break;
            }
            staticServiceImplManager.serviceImplNotExistSet.add(cls.getName());
            return null;
        }
    }

    public class Partition6 {
        static {
            Covode.recordClassIndex(61372);
        }

        public static <T> Set<T> getStaticServiceImplSetReal(StaticServiceImplManager staticServiceImplManager, Class<T> cls) {
            switch (cls.getName().hashCode()) {
                case -2142042626:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ICrossPlatformLegacyService")) {
                        HashSet hashSet = new HashSet();
                        hashSet.add(new CrossPlatformLegacyServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ICrossPlatformLegacyService", hashSet);
                        return hashSet;
                    }
                    break;
                case -2133121688:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService")) {
                        HashSet hashSet2 = new HashSet();
                        hashSet2.add(new BaAutoMessageServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.im.sdk.chat.feature.businessaccount.controller.IBaAutoMessageService", hashSet2);
                        return hashSet2;
                    }
                    break;
                case -2118722668:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IFeedAdService")) {
                        HashSet hashSet3 = new HashSet();
                        hashSet3.add(new FeedAdServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ad.feed.IFeedAdService", hashSet3);
                        return hashSet3;
                    }
                    break;
                case -2116325664:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService")) {
                        HashSet hashSet4 = new HashSet();
                        hashSet4.add(new TranslatedCaptionCacheServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.services.ITranslatedCaptionService", hashSet4);
                        return hashSet4;
                    }
                    break;
                case -2116177744:
                    if (cls.getName().equals("com.bytedance.ies.powerpermissions.IGetInterceptor")) {
                        HashSet hashSet5 = new HashSet();
                        hashSet5.add(new PowerPermissionsTask());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.powerpermissions.IGetInterceptor", hashSet5);
                        return hashSet5;
                    }
                    break;
                case -2097916849:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService")) {
                        HashSet hashSet6 = new HashSet();
                        hashSet6.add(new GDPRServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.gdpr.IGDPRService", hashSet6);
                        return hashSet6;
                    }
                    break;
                case -2088649324:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService")) {
                        HashSet hashSet7 = new HashSet();
                        hashSet7.add(new OpenPlatformServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.opensdkservice.IOpenPlatformService", hashSet7);
                        return hashSet7;
                    }
                    break;
                case -2079081456:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageFragment")) {
                        HashSet hashSet8 = new HashSet();
                        hashSet8.add(new MainPageFragmentImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.IMainPageFragment", hashSet8);
                        return hashSet8;
                    }
                    break;
                case -2072883067:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.story.IStoryDraftService")) {
                        HashSet hashSet9 = new HashSet();
                        hashSet9.add(new StoryDraftServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.story.IStoryDraftService", hashSet9);
                        return hashSet9;
                    }
                    break;
                case -2046909495:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountExperimentLayerService")) {
                        HashSet hashSet10 = new HashSet();
                        hashSet10.add(new AccountExperimentLayerServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IAccountExperimentLayerService", hashSet10);
                        return hashSet10;
                    }
                    break;
                case -2045744714:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.INotificationManagerService")) {
                        HashSet hashSet11 = new HashSet();
                        hashSet11.add(new NotificationManagerServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.im.INotificationManagerService", hashSet11);
                        return hashSet11;
                    }
                    break;
                case -2045670388:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView")) {
                        HashSet hashSet12 = new HashSet();
                        hashSet12.add(new PrivateAccountTipsViewDelegate());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.account.view.IPrivateAccountTipsView", hashSet12);
                        return hashSet12;
                    }
                    break;
                case -2041007322:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IInternalAVService")) {
                        HashSet hashSet13 = new HashSet();
                        hashSet13.add(new AVServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IInternalAVService", hashSet13);
                        return hashSet13;
                    }
                    break;
                case -2009041091:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tcm.api.service.ITcmOutService")) {
                        HashSet hashSet14 = new HashSet();
                        hashSet14.add(new TcmOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.tcm.api.service.ITcmOutService", hashSet14);
                        return hashSet14;
                    }
                    break;
                case -1998285850:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IWebViewService")) {
                        HashSet hashSet15 = new HashSet();
                        hashSet15.add(new WebviewService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.app.services.IWebViewService", hashSet15);
                        return hashSet15;
                    }
                    break;
                case -1994319489:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IMainService")) {
                        HashSet hashSet16 = new HashSet();
                        hashSet16.add(new MainServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IMainService", hashSet16);
                        return hashSet16;
                    }
                    break;
                case -1947571277:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService")) {
                        HashSet hashSet17 = new HashSet();
                        hashSet17.add(new ECommerceService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ecommerce.service.IECommerceService", hashSet17);
                        return hashSet17;
                    }
                    break;
                case -1916678834:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.ICrossLanguageUserService")) {
                        HashSet hashSet18 = new HashSet();
                        hashSet18.add(new CrossLanguageUserExperiment());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.internal.ICrossLanguageUserService", hashSet18);
                        return hashSet18;
                    }
                    break;
                case -1902468907:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService")) {
                        HashSet hashSet19 = new HashSet();
                        hashSet19.add(new CommercializeLiveServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.live.service.ICommercializeLiveService", hashSet19);
                        return hashSet19;
                    }
                    break;
                case -1902050433:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil")) {
                        HashSet hashSet20 = new HashSet();
                        hashSet20.add(new NoticeChallengePropertyUtilImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.utils.NoticeChallengePropertyUtil", hashSet20);
                        return hashSet20;
                    }
                    break;
                case -1890851076:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessGoodsService")) {
                        HashSet hashSet21 = new HashSet();
                        hashSet21.add(new BusinessGoodsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IBusinessGoodsService", hashSet21);
                        return hashSet21;
                    }
                    break;
                case -1884758289:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService")) {
                        HashSet hashSet22 = new HashSet();
                        hashSet22.add(new AlgofreeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.algofree.IAlgofreeService", hashSet22);
                        return hashSet22;
                    }
                    break;
                case -1882551236:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.account.IAccountInitService")) {
                        HashSet hashSet23 = new HashSet();
                        hashSet23.add(new AccountInitServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.account.IAccountInitService", hashSet23);
                        return hashSet23;
                    }
                    break;
                case -1863869896:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageExperimentService")) {
                        HashSet hashSet24 = new HashSet();
                        hashSet24.add(new MainPageExperimentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.IMainPageExperimentService", hashSet24);
                        return hashSet24;
                    }
                    break;
                case -1827092331:
                    if (cls.getName().equals("com.ss.android.ugc.gamora.PageFactory")) {
                        HashSet hashSet25 = new HashSet();
                        hashSet25.add(new PageFactoryDelegate());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.gamora.PageFactory", hashSet25);
                        return hashSet25;
                    }
                    break;
                case -1816256684:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.OldRedPointService")) {
                        HashSet hashSet26 = new HashSet();
                        hashSet26.add(new RedPointServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.count.OldRedPointService", hashSet26);
                        return hashSet26;
                    }
                    break;
                case -1811419603:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.opensdk.IOpenSDKUtilsService")) {
                        HashSet hashSet27 = new HashSet();
                        hashSet27.add(new OpenSDKUtilsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.opensdk.IOpenSDKUtilsService", hashSet27);
                        return hashSet27;
                    }
                    break;
                case -1806927191:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.journey.INewUserJourneyService")) {
                        HashSet hashSet28 = new HashSet();
                        hashSet28.add(new NewUserJourneyService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.journey.INewUserJourneyService", hashSet28);
                        return hashSet28;
                    }
                    break;
                case -1806639590:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feed.service.IFeedComponentService")) {
                        HashSet hashSet29 = new HashSet();
                        hashSet29.add(new FeedComponentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.feed.service.IFeedComponentService", hashSet29);
                        return hashSet29;
                    }
                    break;
                case -1799242804:
                    if (cls.getName().equals("com.bytedance.ies.watcher.IWatcher")) {
                        HashSet hashSet30 = new HashSet();
                        hashSet30.add(new WatcherImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.watcher.IWatcher", hashSet30);
                        return hashSet30;
                    }
                    break;
                case -1785235188:
                    if (cls.getName().equals("com.ss.android.legoapi.IAccountInitializerTaskApi")) {
                        HashSet hashSet31 = new HashSet();
                        hashSet31.add(new AccountInitializerTaskImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.legoapi.IAccountInitializerTaskApi", hashSet31);
                        return hashSet31;
                    }
                    break;
                case -1775773808:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo")) {
                        HashSet hashSet32 = new HashSet();
                        hashSet32.add(new SettingRequestExtraInfoImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.requestcombine.ISettingRequestExtraInfo", hashSet32);
                        return hashSet32;
                    }
                    break;
                case -1772026996:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.crossplatform.ICrossPlatformService")) {
                        HashSet hashSet33 = new HashSet();
                        hashSet33.add(new CrossPlatformServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.crossplatform.ICrossPlatformService", hashSet33);
                        return hashSet33;
                    }
                    break;
                case -1764545303:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache")) {
                        HashSet hashSet34 = new HashSet();
                        hashSet34.add(new LowResolutionImageCache());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ecommerce.service.ILowResolutionImageCache", hashSet34);
                        return hashSet34;
                    }
                    break;
                case -1760828615:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService")) {
                        HashSet hashSet35 = new HashSet();
                        hashSet35.add(new PrivateAccountServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.privateaccount.IPrivateAccountService", hashSet35);
                        return hashSet35;
                    }
                    break;
                case -1750338964:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService")) {
                        HashSet hashSet36 = new HashSet();
                        hashSet36.add(new KidsAccountServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.api.account.IKidsAccountService", hashSet36);
                        return hashSet36;
                    }
                    break;
                case -1738919615:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService")) {
                        HashSet hashSet37 = new HashSet();
                        hashSet37.add(new CommercializeAdServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService", hashSet37);
                        return hashSet37;
                    }
                    break;
                case -1733011232:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService")) {
                        HashSet hashSet38 = new HashSet();
                        hashSet38.add(new ChildModeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.child.IChildModeService", hashSet38);
                        return hashSet38;
                    }
                    break;
                case -1727161271:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService")) {
                        HashSet hashSet39 = new HashSet();
                        hashSet39.add(new SmartFeedPreloadServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedPreloadService", hashSet39);
                        return hashSet39;
                    }
                    break;
                case -1722434065:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.social.monitor.IRelationMonitorService")) {
                        HashSet hashSet40 = new HashSet();
                        hashSet40.add(new RelationMonitorServiceImp());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.social.monitor.IRelationMonitorService", hashSet40);
                        return hashSet40;
                    }
                    break;
                case -1718043654:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService")) {
                        HashSet hashSet41 = new HashSet();
                        hashSet41.add(new ComplianceDependServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.depend.IComplianceDependService", hashSet41);
                        return hashSet41;
                    }
                    break;
                case -1690323830:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.deeplink.IDeepLinkService")) {
                        HashSet hashSet42 = new HashSet();
                        hashSet42.add(new DeepLinkServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.deeplink.IDeepLinkService", hashSet42);
                        return hashSet42;
                    }
                    break;
                case -1667865087:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLCommonService")) {
                        HashSet hashSet43 = new HashSet();
                        hashSet43.add(new MLCommonServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.api.IMLCommonService", hashSet43);
                        return hashSet43;
                    }
                    break;
                case -1643932385:
                    if (cls.getName().equals("com.ss.android.common.util.INetWorkInject")) {
                        HashSet hashSet44 = new HashSet();
                        hashSet44.add(new NetWorkInjectImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.common.util.INetWorkInject", hashSet44);
                        return hashSet44;
                    }
                    break;
                case -1643547945:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService")) {
                        HashSet hashSet45 = new HashSet();
                        hashSet45.add(new ProtectionServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.teenmode.IProtectionService", hashSet45);
                        return hashSet45;
                    }
                    break;
                case -1633603100:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service")) {
                        HashSet hashSet46 = new HashSet();
                        hashSet46.add(new SmartPreloadCommentV2ServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.api.ISmartPreloadCommentV2Service", hashSet46);
                        return hashSet46;
                    }
                    break;
                case -1632619980:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISettingDependService")) {
                        HashSet hashSet47 = new HashSet();
                        hashSet47.add(new SettingDependServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.services.ISettingDependService", hashSet47);
                        return hashSet47;
                    }
                    break;
                case -1614697299:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountService")) {
                        HashSet hashSet48 = new HashSet();
                        hashSet48.add(new AccountService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IAccountService", hashSet48);
                        return hashSet48;
                    }
                    break;
                case -1610244269:
                    if (cls.getName().equals("com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService")) {
                        HashSet hashSet49 = new HashSet();
                        hashSet49.add(new IMCoreProxyService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.im.core.api.proxy.IIMCoreProxyService", hashSet49);
                        return hashSet49;
                    }
                    break;
                case -1609011523:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService")) {
                        HashSet hashSet50 = new HashSet();
                        hashSet50.add(new QAInvitationService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.qainvitation.service.IQAInvitationService", hashSet50);
                        return hashSet50;
                    }
                    break;
                case -1595397874:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IQnaService")) {
                        HashSet hashSet51 = new HashSet();
                        hashSet51.add(new QnaService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IQnaService", hashSet51);
                        return hashSet51;
                    }
                    break;
                case -1581692065:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.service.IIMunder16Proxy")) {
                        HashSet hashSet52 = new HashSet();
                        hashSet52.add(new IMUnder16ProxyImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.im.service.IIMunder16Proxy", hashSet52);
                        return hashSet52;
                    }
                    break;
                case -1558198493:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService")) {
                        HashSet hashSet53 = new HashSet();
                        hashSet53.add(new FamilyPairingServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.familypairing.IFamilyPairingService", hashSet53);
                        return hashSet53;
                    }
                    break;
                case -1555262497:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.api.IZeroRatingService")) {
                        HashSet hashSet54 = new HashSet();
                        hashSet54.add(new ZeroRatingServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.api.IZeroRatingService", hashSet54);
                        return hashSet54;
                    }
                    break;
                case -1553253226:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend")) {
                        HashSet hashSet55 = new HashSet();
                        hashSet55.add(new AdTrackDependImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.track.IAdTrackDepend", hashSet55);
                        return hashSet55;
                    }
                    break;
                case -1544248582:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService")) {
                        HashSet hashSet56 = new HashSet();
                        hashSet56.add(new ECommerceLiveBridgeMethodServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveBridgeService", hashSet56);
                        return hashSet56;
                    }
                    break;
                case -1527643984:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService")) {
                        HashSet hashSet57 = new HashSet();
                        hashSet57.add(new Feed0VVManagerService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.app.services.IFeed0VVManagerService", hashSet57);
                        return hashSet57;
                    }
                    break;
                case -1517460377:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.awemeservice.api.IAwemeService")) {
                        HashSet hashSet58 = new HashSet();
                        hashSet58.add(new AwemeService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.awemeservice.api.IAwemeService", hashSet58);
                        return hashSet58;
                    }
                    break;
                case -1512127072:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareExtService")) {
                        HashSet hashSet59 = new HashSet();
                        hashSet59.add(new ShareExtServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.share.ShareExtService", hashSet59);
                        return hashSet59;
                    }
                    break;
                case -1510438058:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService")) {
                        HashSet hashSet60 = new HashSet();
                        hashSet60.add(new ImEntranceService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IIMEntranceService", hashSet60);
                        return hashSet60;
                    }
                    break;
                case -1509395635:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService")) {
                        HashSet hashSet61 = new HashSet();
                        hashSet61.add(new TermsConsentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.termspp.ITermsConsentService", hashSet61);
                        return hashSet61;
                    }
                    break;
                case -1498800717:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.IAbTestManager")) {
                        HashSet hashSet62 = new HashSet();
                        hashSet62.add(new AbTestManagerImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.IAbTestManager", hashSet62);
                        return hashSet62;
                    }
                    break;
                case -1494693547:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.download.component_api.service.IDownloadService")) {
                        HashSet hashSet63 = new HashSet();
                        hashSet63.add(new DownloadServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.download.component_api.service.IDownloadService", hashSet63);
                        return hashSet63;
                    }
                    break;
                case -1484563773:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IDownloadService")) {
                        HashSet hashSet64 = new HashSet();
                        hashSet64.add(new DownloadService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.app.services.IDownloadService", hashSet64);
                        return hashSet64;
                    }
                    break;
                case -1459016104:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper")) {
                        HashSet hashSet65 = new HashSet();
                        hashSet65.add(new SchemaPageHelperImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.helper.SchemaPageHelper", hashSet65);
                        return hashSet65;
                    }
                    break;
                case -1441338863:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.RedPointService")) {
                        HashSet hashSet66 = new HashSet();
                        hashSet66.add(new RedPointServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.count.RedPointService", hashSet66);
                        return hashSet66;
                    }
                    break;
                case -1437674684:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService")) {
                        HashSet hashSet67 = new HashSet();
                        hashSet67.add(new RequestIdService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService", hashSet67);
                        return hashSet67;
                    }
                    break;
                case -1419081718:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.RecommendUserService")) {
                        HashSet hashSet68 = new HashSet();
                        hashSet68.add(new RecommendUserServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.recommend.users.RecommendUserService", hashSet68);
                        return hashSet68;
                    }
                    break;
                case -1408415368:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.specact.api.ISpecActService")) {
                        HashSet hashSet69 = new HashSet();
                        hashSet69.add(new SpecActServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.specact.api.ISpecActService", hashSet69);
                        return hashSet69;
                    }
                    break;
                case -1403714223:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.service.IEventCenter")) {
                        HashSet hashSet70 = new HashSet();
                        hashSet70.add(new EventCenter());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ecommerce.service.IEventCenter", hashSet70);
                        return hashSet70;
                    }
                    break;
                case -1396670568:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.II18nService")) {
                        HashSet hashSet71 = new HashSet();
                        hashSet71.add(new I18nService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.service.II18nService", hashSet71);
                        return hashSet71;
                    }
                    break;
                case -1379566319:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService")) {
                        HashSet hashSet72 = new HashSet();
                        hashSet72.add(new SmartMLSceneServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.infra.ISmartMLSceneService", hashSet72);
                        return hashSet72;
                    }
                    break;
                case -1379065367:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareService")) {
                        HashSet hashSet73 = new HashSet();
                        hashSet73.add(new ShareServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.share.ShareService", hashSet73);
                        return hashSet73;
                    }
                    break;
                case -1365640136:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting")) {
                        HashSet hashSet74 = new HashSet();
                        hashSet74.add(new VEEncodingImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.tools.draft.ftc.services.IVEEncodingSetting", hashSet74);
                        return hashSet74;
                    }
                    break;
                case -1340720349:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.social.service.IRelationExtService")) {
                        HashSet hashSet75 = new HashSet();
                        hashSet75.add(new RelationExtService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.social.service.IRelationExtService", hashSet75);
                        return hashSet75;
                    }
                    break;
                case -1289181594:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService")) {
                        HashSet hashSet76 = new HashSet();
                        hashSet76.add(new SmartPlaytimePredictServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.infra.ISmartPlaytimePredictService", hashSet76);
                        return hashSet76;
                    }
                    break;
                case -1263811427:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService")) {
                        HashSet hashSet77 = new HashSet();
                        hashSet77.add(new SmartFeedLoadMoreServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedLoadMoreService", hashSet77);
                        return hashSet77;
                    }
                    break;
                case -1259244187:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.mix.api.IDetailMixOperatorService")) {
                        HashSet hashSet78 = new HashSet();
                        hashSet78.add(new DetailMixOperatorServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.mix.api.IDetailMixOperatorService", hashSet78);
                        return hashSet78;
                    }
                    break;
                case -1251125540:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService")) {
                        HashSet hashSet79 = new HashSet();
                        hashSet79.add(new CommonFeedLaunchServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.feed.ICommonFeedLaunchService", hashSet79);
                        return hashSet79;
                    }
                    break;
                case -1228033401:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IAVCommentService")) {
                        HashSet hashSet80 = new HashSet();
                        hashSet80.add(new AVCommentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.internal.IAVCommentService", hashSet80);
                        return hashSet80;
                    }
                    break;
                case -1225060392:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IActivityRouterService")) {
                        HashSet hashSet81 = new HashSet();
                        hashSet81.add(new ActivityRouterServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IActivityRouterService", hashSet81);
                        return hashSet81;
                    }
                    break;
                case -1217333837:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy")) {
                        HashSet hashSet82 = new HashSet();
                        hashSet82.add(new DmNoticeProxyImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.helper.DmNoticeProxy", hashSet82);
                        return hashSet82;
                    }
                    break;
                case -1195195007:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.IAdCardService")) {
                        HashSet hashSet83 = new HashSet();
                        hashSet83.add(new AdCardServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.IAdCardService", hashSet83);
                        return hashSet83;
                    }
                    break;
                case -1195178446:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.net.IReleaseInterceptor")) {
                        HashSet hashSet84 = new HashSet();
                        hashSet84.add(new DevicesNullInterceptor());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.net.IReleaseInterceptor", hashSet84);
                        return hashSet84;
                    }
                    break;
                case -1181313806:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi")) {
                        HashSet hashSet85 = new HashSet();
                        hashSet85.add(new NewUserImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.launcher.service.newuser.INewUserApi", hashSet85);
                        return hashSet85;
                    }
                    break;
                case -1175770854:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.dsp.service.IMusicDspService")) {
                        HashSet hashSet86 = new HashSet();
                        hashSet86.add(new MusicDspServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.dsp.service.IMusicDspService", hashSet86);
                        return hashSet86;
                    }
                    break;
                case -1175242813:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.social.service.IRelationComService")) {
                        HashSet hashSet87 = new HashSet();
                        hashSet87.add(new RelationComService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.social.service.IRelationComService", hashSet87);
                        return hashSet87;
                    }
                    break;
                case -1155118267:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IApiGuardService")) {
                        HashSet hashSet88 = new HashSet();
                        hashSet88.add(new ApiGuardService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IApiGuardService", hashSet88);
                        return hashSet88;
                    }
                    break;
                case -1154900743:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService")) {
                        HashSet hashSet89 = new HashSet();
                        hashSet89.add(new AdLandPageDependOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ad.service.IAdLandPageDependOutService", hashSet89);
                        return hashSet89;
                    }
                    break;
                case -1139302695:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce.service.ICommerceService")) {
                        HashSet hashSet90 = new HashSet();
                        hashSet90.add(new CommerceService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commerce.service.ICommerceService", hashSet90);
                        return hashSet90;
                    }
                    break;
                case -1058542172:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider")) {
                        HashSet hashSet91 = new HashSet();
                        hashSet91.add(new ChallengeDetailProvicer());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProvider", hashSet91);
                        return hashSet91;
                    }
                    break;
                case -1039515171:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.userservice.api.IUserService")) {
                        HashSet hashSet92 = new HashSet();
                        hashSet92.add(new UserService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.userservice.api.IUserService", hashSet92);
                        return hashSet92;
                    }
                    break;
                case -1037175629:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.comment.services.CommentService")) {
                        HashSet hashSet93 = new HashSet();
                        hashSet93.add(new CommentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.comment.services.CommentService", hashSet93);
                        return hashSet93;
                    }
                    break;
                case -1034497889:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend")) {
                        HashSet hashSet94 = new HashSet();
                        hashSet94.add(new AdRouterHandlerDependImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend", hashSet94);
                        return hashSet94;
                    }
                    break;
                case -1021402751:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.net.InterceptorProvider")) {
                        HashSet hashSet95 = new HashSet();
                        hashSet95.add(new InterceptorHolder());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.net.InterceptorProvider", hashSet95);
                        return hashSet95;
                    }
                    break;
                case -1015551078:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IFollowFeedService")) {
                        HashSet hashSet96 = new HashSet();
                        hashSet96.add(new FollowFeedServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.service.IFollowFeedService", hashSet96);
                        return hashSet96;
                    }
                    break;
                case -978906707:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService")) {
                        HashSet hashSet97 = new HashSet();
                        hashSet97.add(new SmartRegressCalculateServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.infra.ISmartRegressCalculateService", hashSet97);
                        return hashSet97;
                    }
                    break;
                case -977842286:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IShareService")) {
                        HashSet hashSet98 = new HashSet();
                        hashSet98.add(new com.ss.android.ugc.aweme.internal.ShareServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.internal.IShareService", hashSet98);
                        return hashSet98;
                    }
                    break;
                case -955482181:
                    if (cls.getName().equals("com.ss.android.legoapi.ISysOptTaskApi")) {
                        HashSet hashSet99 = new HashSet();
                        hashSet99.add(new SysOptTaskImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.legoapi.ISysOptTaskApi", hashSet99);
                        return hashSet99;
                    }
                    break;
                case -935773963:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService")) {
                        HashSet hashSet100 = new HashSet();
                        hashSet100.add(new CommonFeedApiService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService", hashSet100);
                        return hashSet100;
                    }
                    break;
                case -927795034:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IStorageManagerService")) {
                        HashSet hashSet101 = new HashSet();
                        hashSet101.add(new StorageManagerService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IStorageManagerService", hashSet101);
                        return hashSet101;
                    }
                    break;
                case -921805160:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.LogHelper")) {
                        HashSet hashSet102 = new HashSet();
                        hashSet102.add(new LogHelperImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.helper.LogHelper", hashSet102);
                        return hashSet102;
                    }
                    break;
                case -920387194:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.bullet.api.IBulletService")) {
                        HashSet hashSet103 = new HashSet();
                        hashSet103.add(new BulletService());
                        hashSet103.add(new BulletServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.bullet.api.IBulletService", hashSet103);
                        return hashSet103;
                    }
                    break;
                case -920282637:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService")) {
                        HashSet hashSet104 = new HashSet();
                        hashSet104.add(new RuntimeBehaviorServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.feedback.runtime.behavior.IRuntimeBehaviorService", hashSet104);
                        return hashSet104;
                    }
                    break;
                case -915558489:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IPropReuseService")) {
                        HashSet hashSet105 = new HashSet();
                        hashSet105.add(new PropReuseServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.tools.detail.IPropReuseService", hashSet105);
                        return hashSet105;
                    }
                    break;
                case -884425869:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicService")) {
                        HashSet hashSet106 = new HashSet();
                        hashSet106.add(new MusicService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.music.service.IMusicService", hashSet106);
                        return hashSet106;
                    }
                    break;
                case -883042393:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService")) {
                        HashSet hashSet107 = new HashSet();
                        hashSet107.add(new EditVideoInfoServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.edit.IEditVideoInfoService", hashSet107);
                        return hashSet107;
                    }
                    break;
                case -875578063:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.secapi.ISecApi")) {
                        HashSet hashSet108 = new HashSet();
                        hashSet108.add(new SecApiImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.secapi.ISecApi", hashSet108);
                        return hashSet108;
                    }
                    break;
                case -875547947:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAppWidgetService")) {
                        HashSet hashSet109 = new HashSet();
                        hashSet109.add(new AppWidgetServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IAppWidgetService", hashSet109);
                        return hashSet109;
                    }
                    break;
                case -871727766:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.utils.LanguageProvider")) {
                        HashSet hashSet110 = new HashSet();
                        hashSet110.add(new LanguageService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.utils.LanguageProvider", hashSet110);
                        return hashSet110;
                    }
                    break;
                case -847616942:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.service.IEOYService")) {
                        HashSet hashSet111 = new HashSet();
                        hashSet111.add(new EOYServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.service.IEOYService", hashSet111);
                        return hashSet111;
                    }
                    break;
                case -847459216:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi")) {
                        HashSet hashSet112 = new HashSet();
                        hashSet112.add(new GodzillaImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.launcher.service.godzilla.IGodzillaApi", hashSet112);
                        return hashSet112;
                    }
                    break;
                case -801228301:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IShowInviteUserListService")) {
                        HashSet hashSet113 = new HashSet();
                        hashSet113.add(new InviteUseListService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.friends.service.IShowInviteUserListService", hashSet113);
                        return hashSet113;
                    }
                    break;
                case -797912089:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.service.IIMService")) {
                        HashSet hashSet114 = new HashSet();
                        hashSet114.add(new IMService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.im.service.IIMService", hashSet114);
                        return hashSet114;
                    }
                    break;
                case -790607001:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ug.IUgCommonService")) {
                        HashSet hashSet115 = new HashSet();
                        hashSet115.add(new UgCommonServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ug.IUgCommonService", hashSet115);
                        return hashSet115;
                    }
                    break;
                case -781406739:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService")) {
                        HashSet hashSet116 = new HashSet();
                        hashSet116.add(new CommerceStickerServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerService", hashSet116);
                        return hashSet116;
                    }
                    break;
                case -768296629:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService")) {
                        HashSet hashSet117 = new HashSet();
                        hashSet117.add(new KidsWellbeingServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.setting.api.IKidsWellbeingService", hashSet117);
                        return hashSet117;
                    }
                    break;
                case -760523568:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.PerformanceMainService")) {
                        HashSet hashSet118 = new HashSet();
                        hashSet118.add(new PerformanceMainServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.PerformanceMainService", hashSet118);
                        return hashSet118;
                    }
                    break;
                case -757369727:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.draft.model.DraftUpdateService")) {
                        HashSet hashSet119 = new HashSet();
                        hashSet119.add(new DraftUpdateServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.draft.model.DraftUpdateService", hashSet119);
                        return hashSet119;
                    }
                    break;
                case -751273669:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.IAdCardOutService")) {
                        HashSet hashSet120 = new HashSet();
                        hashSet120.add(new AdCardOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.IAdCardOutService", hashSet120);
                        return hashSet120;
                    }
                    break;
                case -750502703:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkInitService")) {
                        HashSet hashSet121 = new HashSet();
                        hashSet121.add(new BenchmarkInitService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.bl.IBenchmarkInitService", hashSet121);
                        return hashSet121;
                    }
                    break;
                case -738010642:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.poi_api.service.IPoiService")) {
                        HashSet hashSet122 = new HashSet();
                        hashSet122.add(new PoiServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.poi_api.service.IPoiService", hashSet122);
                        return hashSet122;
                    }
                    break;
                case -728326428:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAvSearchUserService")) {
                        HashSet hashSet123 = new HashSet();
                        hashSet123.add(new AvSearchUserServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.port.in.IAvSearchUserService", hashSet123);
                        return hashSet123;
                    }
                    break;
                case -727390069:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feed.cache.IFeedApi")) {
                        HashSet hashSet124 = new HashSet();
                        hashSet124.add(new FeedApiService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.feed.cache.IFeedApi", hashSet124);
                        return hashSet124;
                    }
                    break;
                case -724947689:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.story.IStoryPublishService")) {
                        HashSet hashSet125 = new HashSet();
                        hashSet125.add(new StoryPublishServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.story.IStoryPublishService", hashSet125);
                        return hashSet125;
                    }
                    break;
                case -713308800:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IHybridABInfoService")) {
                        HashSet hashSet126 = new HashSet();
                        hashSet126.add(new HybridABInfoService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.app.services.IHybridABInfoService", hashSet126);
                        return hashSet126;
                    }
                    break;
                case -707368300:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IFestivalService")) {
                        HashSet hashSet127 = new HashSet();
                        hashSet127.add(new FestivalService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.port.in.IFestivalService", hashSet127);
                        return hashSet127;
                    }
                    break;
                case -706380519:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAVMixFeedService")) {
                        HashSet hashSet128 = new HashSet();
                        hashSet128.add(new IAVMixFeedServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.port.in.IAVMixFeedService", hashSet128);
                        return hashSet128;
                    }
                    break;
                case -688908617:
                    if (cls.getName().equals("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService")) {
                        HashSet hashSet129 = new HashSet();
                        hashSet129.add(new DeeplinkPrefetchImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.tiktok.deeplink.IDeepLinkSecurityService", hashSet129);
                        return hashSet129;
                    }
                    break;
                case -687432460:
                    if (cls.getName().equals("com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory")) {
                        HashSet hashSet130 = new HashSet();
                        hashSet130.add(new EditRootSceneFactoryDelegate());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.gamora.editor.rootscene.IEditRootSceneFactory", hashSet130);
                        return hashSet130;
                    }
                    break;
                case -679535832:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.IServerPortraitService")) {
                        HashSet hashSet131 = new HashSet();
                        hashSet131.add(new ServerPortraitCollections());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.requestcombine.IServerPortraitService", hashSet131);
                        return hashSet131;
                    }
                    break;
                case -679339171:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IUIUXBugsExperimentService")) {
                        HashSet hashSet132 = new HashSet();
                        hashSet132.add(new UIUXBugsExperimentService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IUIUXBugsExperimentService", hashSet132);
                        return hashSet132;
                    }
                    break;
                case -676259965:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider")) {
                        HashSet hashSet133 = new HashSet();
                        hashSet133.add(new NetworkConfigProvider());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.network.INetworkConfigProvider", hashSet133);
                        return hashSet133;
                    }
                    break;
                case -653943499:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService")) {
                        HashSet hashSet134 = new HashSet();
                        hashSet134.add(new LegacyCommercializeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService", hashSet134);
                        return hashSet134;
                    }
                    break;
                case -643691779:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService")) {
                        HashSet hashSet135 = new HashSet();
                        hashSet135.add(new UserInfoUpdateAdapterService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.framework.services.IAccountInfoUpdateAdapterService", hashSet135);
                        return hashSet135;
                    }
                    break;
                case -642110915:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.function.IFunctionSupportService")) {
                        HashSet hashSet136 = new HashSet();
                        hashSet136.add(new FunctionSupportServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.function.IFunctionSupportService", hashSet136);
                        return hashSet136;
                    }
                    break;
                case -628620472:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService")) {
                        HashSet hashSet137 = new HashSet();
                        hashSet137.add(new SmartClassifyServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.infra.ISmartClassifyService", hashSet137);
                        return hashSet137;
                    }
                    break;
                case -607424883:
                    if (cls.getName().equals("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService")) {
                        HashSet hashSet138 = new HashSet();
                        hashSet138.add(new CustomActivityOnCrashServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.customactivityoncrash_base.ICustomActivityOnCrashService", hashSet138);
                        return hashSet138;
                    }
                    break;
                case -603851576:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IContactService")) {
                        HashSet hashSet139 = new HashSet();
                        hashSet139.add(new ContactServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.friends.service.IContactService", hashSet139);
                        return hashSet139;
                    }
                    break;
                case -582786788:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.journey.INewUserMainModuleService")) {
                        HashSet hashSet140 = new HashSet();
                        hashSet140.add(new NewUserMainModuleService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.journey.INewUserMainModuleService", hashSet140);
                        return hashSet140;
                    }
                    break;
                case -572575565:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.edit.IReplaceMusicService")) {
                        HashSet hashSet141 = new HashSet();
                        hashSet141.add(new ReplaceMusicServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.edit.IReplaceMusicService", hashSet141);
                        return hashSet141;
                    }
                    break;
                case -553887713:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService")) {
                        HashSet hashSet142 = new HashSet();
                        hashSet142.add(new RecommendFeedServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.recommendfeed.api.IRecommendFeedService", hashSet142);
                        return hashSet142;
                    }
                    break;
                case -550872997:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper")) {
                        HashSet hashSet143 = new HashSet();
                        hashSet143.add(new MainServiceHelperImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper", hashSet143);
                        return hashSet143;
                    }
                    break;
                case -544454424:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService")) {
                        HashSet hashSet144 = new HashSet();
                        hashSet144.add(new MainFragmentCacheExpServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.experiment.IMainFragmentCacheExpService", hashSet144);
                        return hashSet144;
                    }
                    break;
                case -537976318:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IPreLoginHandleService")) {
                        HashSet hashSet145 = new HashSet();
                        hashSet145.add(new PreLoginHandleService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IPreLoginHandleService", hashSet145);
                        return hashSet145;
                    }
                    break;
                case -470712021:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IProfileNaviService")) {
                        HashSet hashSet146 = new HashSet();
                        hashSet146.add(new ProfileNaviServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IProfileNaviService", hashSet146);
                        return hashSet146;
                    }
                    break;
                case -469570464:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper")) {
                        HashSet hashSet147 = new HashSet();
                        hashSet147.add(new FollowTabBubbleGuideHelperImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.guide.IFollowTabBubbleGuideHelper", hashSet147);
                        return hashSet147;
                    }
                    break;
                case -451157663:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider")) {
                        HashSet hashSet148 = new HashSet();
                        hashSet148.add(new MixActivityContainerProvider());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.crossplatform.business.IMixActivityContainerProvider", hashSet148);
                        return hashSet148;
                    }
                    break;
                case -413830924:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService")) {
                        HashSet hashSet149 = new HashSet();
                        hashSet149.add(new SplitVideoServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.cutvideo.ISplitVideoService", hashSet149);
                        return hashSet149;
                    }
                    break;
                case -405727142:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService")) {
                        HashSet hashSet150 = new HashSet();
                        hashSet150.add(new CommentStickerRecordServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.comment.services.ICommentStickerRecordService", hashSet150);
                        return hashSet150;
                    }
                    break;
                case -401510911:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService")) {
                        HashSet hashSet151 = new HashSet();
                        hashSet151.add(new SmartFeedAdUIServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.api.ISmartFeedAdUIService", hashSet151);
                        return hashSet151;
                    }
                    break;
                case -401450704:
                    if (cls.getName().equals("com.ss.android.legoapi.abtest.IABLegoTaskApi")) {
                        HashSet hashSet152 = new HashSet();
                        hashSet152.add(new ABLegoTaskImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.legoapi.abtest.IABLegoTaskApi", hashSet152);
                        return hashSet152;
                    }
                    break;
                case -381018931:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoveryService")) {
                        HashSet hashSet153 = new HashSet();
                        hashSet153.add(new DiscoveryServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.discover.IDiscoveryService", hashSet153);
                        return hashSet153;
                    }
                    break;
                case -360388275:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService")) {
                        HashSet hashSet154 = new HashSet();
                        hashSet154.add(new MLDataCenterServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.api.IMLDataCenterService", hashSet154);
                        return hashSet154;
                    }
                    break;
                case -343801484:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.search.service.ISearchUserService")) {
                        HashSet hashSet155 = new HashSet();
                        hashSet155.add(new SearchUserService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.search.service.ISearchUserService", hashSet155);
                        return hashSet155;
                    }
                    break;
                case -338797404:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.watermark.IWaterMarkService")) {
                        HashSet hashSet156 = new HashSet();
                        hashSet156.add(new WaterMarkServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.watermark.IWaterMarkService", hashSet156);
                        return hashSet156;
                    }
                    break;
                case -336112860:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService")) {
                        HashSet hashSet157 = new HashSet();
                        hashSet157.add(new ComplianceBusinessServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.businesses.IComplianceBusinessService", hashSet157);
                        return hashSet157;
                    }
                    break;
                case -317372455:
                    if (cls.getName().equals("com.ss.android.ugc.tiktok.seclink.ISecLinkService")) {
                        HashSet hashSet158 = new HashSet();
                        hashSet158.add(new SecLinkServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.tiktok.seclink.ISecLinkService", hashSet158);
                        return hashSet158;
                    }
                    break;
                case -316841472:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService")) {
                        HashSet hashSet159 = new HashSet();
                        hashSet159.add(new ShoutoutsReviewService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.shoutouts.api.IShoutoutsReviewService", hashSet159);
                        return hashSet159;
                    }
                    break;
                case -315654493:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService")) {
                        HashSet hashSet160 = new HashSet();
                        hashSet160.add(new FTCServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.ftc.IFTCService", hashSet160);
                        return hashSet160;
                    }
                    break;
                case -307992734:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.music.service.IMusicDetailService")) {
                        HashSet hashSet161 = new HashSet();
                        hashSet161.add(new MusicDetailService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.music.service.IMusicDetailService", hashSet161);
                        return hashSet161;
                    }
                    break;
                case -296051311:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.ISettingManagerService")) {
                        HashSet hashSet162 = new HashSet();
                        hashSet162.add(new SettingManagerServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.ISettingManagerService", hashSet162);
                        return hashSet162;
                    }
                    break;
                case -265816009:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy")) {
                        HashSet hashSet163 = new HashSet();
                        hashSet163.add(new BulletHostProxy());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.bullet.api.IBulletHostProxy", hashSet163);
                        return hashSet163;
                    }
                    break;
                case -249931293:
                    if (cls.getName().equals("com.ss.android.sdk.webview.di.IMainServiceForJsb")) {
                        HashSet hashSet164 = new HashSet();
                        hashSet164.add(new MainServiceForJsb());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.sdk.webview.di.IMainServiceForJsb", hashSet164);
                        return hashSet164;
                    }
                    break;
                case -242240457:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IReplaceMusicDownloadService")) {
                        HashSet hashSet165 = new HashSet();
                        hashSet165.add(new ReplaceMusicDownloadService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IReplaceMusicDownloadService", hashSet165);
                        return hashSet165;
                    }
                    break;
                case -228631819:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.ab.NoticeABService")) {
                        HashSet hashSet166 = new HashSet();
                        hashSet166.add(new NoticeABServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.ab.NoticeABService", hashSet166);
                        return hashSet166;
                    }
                    break;
                case -219610361:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.IStickerViewService")) {
                        HashSet hashSet167 = new HashSet();
                        hashSet167.add(new StickerViewServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.sticker.IStickerViewService", hashSet167);
                        return hashSet167;
                    }
                    break;
                case -206316949:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareFlavorService")) {
                        HashSet hashSet168 = new HashSet();
                        hashSet168.add(new ShareFlavorServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.share.ShareFlavorService", hashSet168);
                        return hashSet168;
                    }
                    break;
                case -188045946:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.abmock.IKidsAbMockService")) {
                        HashSet hashSet169 = new HashSet();
                        hashSet169.add(new KidsRegisterMockImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.api.abmock.IKidsAbMockService", hashSet169);
                        return hashSet169;
                    }
                    break;
                case -184461633:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tcm.api.service.ITcmService")) {
                        HashSet hashSet170 = new HashSet();
                        hashSet170.add(new TcmServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.tcm.api.service.ITcmService", hashSet170);
                        return hashSet170;
                    }
                    break;
                case -141121201:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerOutService")) {
                        HashSet hashSet171 = new HashSet();
                        hashSet171.add(new CommerceStickerOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commerce_sticker_api.service.ICommerceStickerOutService", hashSet171);
                        return hashSet171;
                    }
                    break;
                case -138974023:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.IRetrofitFactory")) {
                        HashSet hashSet172 = new HashSet();
                        hashSet172.add(new RetrofitFactory());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.network.IRetrofitFactory", hashSet172);
                        return hashSet172;
                    }
                    break;
                case -132128589:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeService")) {
                        HashSet hashSet173 = new HashSet();
                        hashSet173.add(new ChallengeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.challenge.service.IChallengeService", hashSet173);
                        return hashSet173;
                    }
                    break;
                case -130657778:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.AVApi")) {
                        HashSet hashSet174 = new HashSet();
                        hashSet174.add(new AVApiImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.tools.AVApi", hashSet174);
                        return hashSet174;
                    }
                    break;
                case -123206016:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.ISettingService")) {
                        HashSet hashSet175 = new HashSet();
                        hashSet175.add(new SettingServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.services.ISettingService", hashSet175);
                        return hashSet175;
                    }
                    break;
                case -115845173:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAVServiceProxy")) {
                        HashSet hashSet176 = new HashSet();
                        hashSet176.add(new AVServiceProxyImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IAVServiceProxy", hashSet176);
                        return hashSet176;
                    }
                    break;
                case -77732678:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService")) {
                        HashSet hashSet177 = new HashSet();
                        hashSet177.add(new TpcConsentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.consent.ITpcConsentService", hashSet177);
                        return hashSet177;
                    }
                    break;
                case -66305606:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen")) {
                        HashSet hashSet178 = new HashSet();
                        hashSet178.add(new AdLightWebPageOpenUtils());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ad.feed.IAdLightWebPageOpen", hashSet178);
                        return hashSet178;
                    }
                    break;
                case -58960682:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi")) {
                        HashSet hashSet179 = new HashSet();
                        hashSet179.add(new CrashSdkImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.launcher.service.crashsdk.ICrashSdkApi", hashSet179);
                        return hashSet179;
                    }
                    break;
                case -56944482:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.ILanguageService")) {
                        HashSet hashSet180 = new HashSet();
                        hashSet180.add(new com.ss.android.ugc.aweme.setting.services.LanguageService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.service.ILanguageService", hashSet180);
                        return hashSet180;
                    }
                    break;
                case -45175540:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService")) {
                        HashSet hashSet181 = new HashSet();
                        hashSet181.add(new InferenceEngineServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.inferenceengine.IInferenceEngineService", hashSet181);
                        return hashSet181;
                    }
                    break;
                case -15737757:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.locale.ILocalService")) {
                        HashSet hashSet182 = new HashSet();
                        hashSet182.add(new LocalServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.locale.ILocalService", hashSet182);
                        return hashSet182;
                    }
                    break;
                case 8583776:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.social.widget.card.ISocialCardService")) {
                        HashSet hashSet183 = new HashSet();
                        hashSet183.add(new SocialCardServiceImp());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.social.widget.card.ISocialCardService", hashSet183);
                        return hashSet183;
                    }
                    break;
                case 23310771:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IFriendsService")) {
                        HashSet hashSet184 = new HashSet();
                        hashSet184.add(new FriendsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.friends.service.IFriendsService", hashSet184);
                        return hashSet184;
                    }
                    break;
                case 31921668:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.favorites.service.IFavoriteService")) {
                        HashSet hashSet185 = new HashSet();
                        hashSet185.add(new FavoriteServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.favorites.service.IFavoriteService", hashSet185);
                        return hashSet185;
                    }
                    break;
                case 42826893:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IWebViewTweaker")) {
                        HashSet hashSet186 = new HashSet();
                        hashSet186.add(new WebViewTweakerService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.framework.services.IWebViewTweaker", hashSet186);
                        return hashSet186;
                    }
                    break;
                case 53902533:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.upvote.service.IUpvoteService")) {
                        HashSet hashSet187 = new HashSet();
                        hashSet187.add(new UpvoteServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.upvote.service.IUpvoteService", hashSet187);
                        return hashSet187;
                    }
                    break;
                case 57780698:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service")) {
                        HashSet hashSet188 = new HashSet();
                        hashSet188.add(new SmartPreloadProfileV2ServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.api.ISmartPreloadProfileV2Service", hashSet188);
                        return hashSet188;
                    }
                    break;
                case 78503464:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IDuetDownloadService")) {
                        HashSet hashSet189 = new HashSet();
                        hashSet189.add(new DuetDownloadService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IDuetDownloadService", hashSet189);
                        return hashSet189;
                    }
                    break;
                case 87343796:
                    if (cls.getName().equals("com.benchmark.IBTCHConfiguration")) {
                        HashSet hashSet190 = new HashSet();
                        hashSet190.add(new BTCHConfigurationImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.benchmark.IBTCHConfiguration", hashSet190);
                        return hashSet190;
                    }
                    break;
                case 118052236:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IShoutOutApiService")) {
                        HashSet hashSet191 = new HashSet();
                        hashSet191.add(new ShoutOutServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.internal.IShoutOutApiService", hashSet191);
                        return hashSet191;
                    }
                    break;
                case 120575931:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.service.ICommerceService")) {
                        HashSet hashSet192 = new HashSet();
                        hashSet192.add(new CommerceServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.service.ICommerceService", hashSet192);
                        return hashSet192;
                    }
                    break;
                case 128063043:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService")) {
                        HashSet hashSet193 = new HashSet();
                        hashSet193.add(new AntiAddictionServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.antiaddiction.IAntiAddictionService", hashSet193);
                        return hashSet193;
                    }
                    break;
                case 129889384:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IVEABService")) {
                        HashSet hashSet194 = new HashSet();
                        hashSet194.add(new VEABServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IVEABService", hashSet194);
                        return hashSet194;
                    }
                    break;
                case 154527039:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi")) {
                        HashSet hashSet195 = new HashSet();
                        hashSet195.add(new MobLaunchImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.launcher.service.mob.IMobLaunchApi", hashSet195);
                        return hashSet195;
                    }
                    break;
                case 163017647:
                    if (cls.getName().equals("com.ss.android.ugc.awemepushapi.IPushApi")) {
                        HashSet hashSet196 = new HashSet();
                        hashSet196.add(new PushService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.awemepushapi.IPushApi", hashSet196);
                        return hashSet196;
                    }
                    break;
                case 169684431:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeOutService")) {
                        HashSet hashSet197 = new HashSet();
                        hashSet197.add(new CommerceChallengeOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeOutService", hashSet197);
                        return hashSet197;
                    }
                    break;
                case 180595487:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IPreloadApiService")) {
                        HashSet hashSet198 = new HashSet();
                        hashSet198.add(new PreloadApiServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IPreloadApiService", hashSet198);
                        return hashSet198;
                    }
                    break;
                case 182098267:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory")) {
                        HashSet hashSet199 = new HashSet();
                        hashSet199.add(new EffectPlatformFactory());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.effectplatform.IEffectPlatformFactory", hashSet199);
                        return hashSet199;
                    }
                    break;
                case 182296402:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IPrivacySettingService")) {
                        HashSet hashSet200 = new HashSet();
                        hashSet200.add(new PrivacySettingService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.services.IPrivacySettingService", hashSet200);
                        return hashSet200;
                    }
                    break;
                case 189816622:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService")) {
                        HashSet hashSet201 = new HashSet();
                        hashSet201.add(new AuthorizeCommonService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.framework.services.IAuthorizeCommonService", hashSet201);
                        return hashSet201;
                    }
                    break;
                case 193978339:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService")) {
                        HashSet hashSet202 = new HashSet();
                        hashSet202.add(new AgeGateServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService", hashSet202);
                        return hashSet202;
                    }
                    break;
                case 197343978:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.mix.services.IMixFeedService")) {
                        HashSet hashSet203 = new HashSet();
                        hashSet203.add(new MixFeedService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.mix.services.IMixFeedService", hashSet203);
                        return hashSet203;
                    }
                    break;
                case 206207455:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService")) {
                        HashSet hashSet204 = new HashSet();
                        hashSet204.add(new ECommerceRNToLynxConfigService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceRNToLynxConfigService", hashSet204);
                        return hashSet204;
                    }
                    break;
                case 207468481:
                    if (cls.getName().equals("com.bytedance.ies.powerlist.IPowerContext")) {
                        HashSet hashSet205 = new HashSet();
                        hashSet205.add(new PowerContextImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.powerlist.IPowerContext", hashSet205);
                        return hashSet205;
                    }
                    break;
                case 220135637:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IRetrofitService")) {
                        HashSet hashSet206 = new HashSet();
                        hashSet206.add(new RetrofitService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.framework.services.IRetrofitService", hashSet206);
                        return hashSet206;
                    }
                    break;
                case 249088543:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance")) {
                        HashSet hashSet207 = new HashSet();
                        hashSet207.add(new KidsMusicEntrance());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.api.music.IKidsMusicEntrance", hashSet207);
                        return hashSet207;
                    }
                    break;
                case 271148800:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IMandatoryLoginService")) {
                        HashSet hashSet208 = new HashSet();
                        hashSet208.add(new MandatoryLoginService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IMandatoryLoginService", hashSet208);
                        return hashSet208;
                    }
                    break;
                case 294068060:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareH5Service")) {
                        HashSet hashSet209 = new HashSet();
                        hashSet209.add(new ShareH5ServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.share.ShareH5Service", hashSet209);
                        return hashSet209;
                    }
                    break;
                case 316475372:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.story.IStoryService")) {
                        HashSet hashSet210 = new HashSet();
                        hashSet210.add(new StoryServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.story.IStoryService", hashSet210);
                        return hashSet210;
                    }
                    break;
                case 355979482:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAccountInitializer")) {
                        HashSet hashSet211 = new HashSet();
                        hashSet211.add(new AccountInitializer());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IAccountInitializer", hashSet211);
                        return hashSet211;
                    }
                    break;
                case 361159208:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.web.IGeckoXClientManager")) {
                        HashSet hashSet212 = new HashSet();
                        hashSet212.add(new GeckoXClientManager());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.web.IGeckoXClientManager", hashSet212);
                        return hashSet212;
                    }
                    break;
                case 389511774:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.poi_map.service.IPoiMapService")) {
                        HashSet hashSet213 = new HashSet();
                        hashSet213.add(new PoiMapServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.poi_map.service.IPoiMapService", hashSet213);
                        return hashSet213;
                    }
                    break;
                case 394604807:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.net.INetReleaseInterceptor")) {
                        HashSet hashSet214 = new HashSet();
                        hashSet214.add(new NetWorkSpeedInterceptor());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.net.INetReleaseInterceptor", hashSet214);
                        return hashSet214;
                    }
                    break;
                case 403114353:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService")) {
                        HashSet hashSet215 = new HashSet();
                        hashSet215.add(new SearchAdServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.commercialize.search.service.ISearchAdService", hashSet215);
                        return hashSet215;
                    }
                    break;
                case 404162146:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics")) {
                        HashSet hashSet216 = new HashSet();
                        hashSet216.add(new SearchResultStatisticsImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.discover.mob.ISearchResultStatistics", hashSet216);
                        return hashSet216;
                    }
                    break;
                case 438431874:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.hitrank.IRankHelperService")) {
                        HashSet hashSet217 = new HashSet();
                        hashSet217.add(new RankHelperServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.discover.hitrank.IRankHelperService", hashSet217);
                        return hashSet217;
                    }
                    break;
                case 453717049:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager")) {
                        HashSet hashSet218 = new HashSet();
                        hashSet218.add(new ReportAwemeManager());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.common.services.IReportAwemeManager", hashSet218);
                        return hashSet218;
                    }
                    break;
                case 470426976:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil")) {
                        HashSet hashSet219 = new HashSet();
                        hashSet219.add(new PrivacyDisclaimerUtilService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IPrivacyDisclaimerUtil", hashSet219);
                        return hashSet219;
                    }
                    break;
                case 480277125:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.IDiscoverAllService")) {
                        HashSet hashSet220 = new HashSet();
                        hashSet220.add(new DiscoverAllServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.discover.IDiscoverAllService", hashSet220);
                        return hashSet220;
                    }
                    break;
                case 493767622:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService")) {
                        HashSet hashSet221 = new HashSet();
                        hashSet221.add(new CommerceMediaOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaOutService", hashSet221);
                        return hashSet221;
                    }
                    break;
                case 501025197:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IExternalService")) {
                        HashSet hashSet222 = new HashSet();
                        hashSet222.add(new AVExternalServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IExternalService", hashSet222);
                        return hashSet222;
                    }
                    break;
                case 509545079:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker")) {
                        HashSet hashSet223 = new HashSet();
                        hashSet223.add(new VideoLengthChecker());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker", hashSet223);
                        return hashSet223;
                    }
                    break;
                case 516119261:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.share.ShareDependService")) {
                        HashSet hashSet224 = new HashSet();
                        hashSet224.add(new ShareDependServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.share.ShareDependService", hashSet224);
                        return hashSet224;
                    }
                    break;
                case 524921666:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.DetailFeedService")) {
                        HashSet hashSet225 = new HashSet();
                        hashSet225.add(new DetailFeedServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.DetailFeedService", hashSet225);
                        return hashSet225;
                    }
                    break;
                case 527997931:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend")) {
                        HashSet hashSet226 = new HashSet();
                        hashSet226.add(new AdCommentDependImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ad.comment.depend.IAdCommentDepend", hashSet226);
                        return hashSet226;
                    }
                    break;
                case 531388658:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi")) {
                        HashSet hashSet227 = new HashSet();
                        hashSet227.add(new AppsflyerImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.launcher.service.appsflyer.IAppsflyerApi", hashSet227);
                        return hashSet227;
                    }
                    break;
                case 535970203:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.sticker.ICaptionService")) {
                        HashSet hashSet228 = new HashSet();
                        hashSet228.add(new CaptionServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.sticker.ICaptionService", hashSet228);
                        return hashSet228;
                    }
                    break;
                case 540084577:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IDuetDetailService")) {
                        HashSet hashSet229 = new HashSet();
                        hashSet229.add(new DuetDetailServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.tools.detail.IDuetDetailService", hashSet229);
                        return hashSet229;
                    }
                    break;
                case 574732927:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService")) {
                        HashSet hashSet230 = new HashSet();
                        hashSet230.add(new com.ss.android.ugc.aweme.kids.discovery.DiscoveryServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.discovery.api.IDiscoveryService", hashSet230);
                        return hashSet230;
                    }
                    break;
                case 587542919:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService")) {
                        HashSet hashSet231 = new HashSet();
                        hashSet231.add(new ChallengeDetailServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.challenge.api.IChallengeDetailService", hashSet231);
                        return hashSet231;
                    }
                    break;
                case 596657451:
                    if (cls.getName().equals("com.bytedance.ies.ugc.appcontext.AppBuildConfig")) {
                        HashSet hashSet232 = new HashSet();
                        hashSet232.add(new AwemeAppBuildConfig());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.appcontext.AppBuildConfig", hashSet232);
                        return hashSet232;
                    }
                    break;
                case 602001356:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService")) {
                        HashSet hashSet233 = new HashSet();
                        hashSet233.add(new StrategyService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ecommerce.router.IStrategyService", hashSet233);
                        return hashSet233;
                    }
                    break;
                case 607980095:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IGuestModeService")) {
                        HashSet hashSet234 = new HashSet();
                        hashSet234.add(new GuestModeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IGuestModeService", hashSet234);
                        return hashSet234;
                    }
                    break;
                case 612752120:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService")) {
                        HashSet hashSet235 = new HashSet();
                        hashSet235.add(new ContentLanguageServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.contentlanguage.api.IContentLanguageService", hashSet235);
                        return hashSet235;
                    }
                    break;
                case 628686499:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter")) {
                        HashSet hashSet236 = new HashSet();
                        hashSet236.add(new NoticeLiveServiceAdapterImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.adapter.NoticeLiveServiceAdapter", hashSet236);
                        return hashSet236;
                    }
                    break;
                case 631540268:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.comment.IAdCommentService")) {
                        HashSet hashSet237 = new HashSet();
                        hashSet237.add(new AdCommentService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ad.comment.IAdCommentService", hashSet237);
                        return hashSet237;
                    }
                    break;
                case 634505157:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.report.IReportService")) {
                        HashSet hashSet238 = new HashSet();
                        hashSet238.add(new ReportServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.report.IReportService", hashSet238);
                        return hashSet238;
                    }
                    break;
                case 647695418:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService")) {
                        HashSet hashSet239 = new HashSet();
                        hashSet239.add(new NoticeCommentHelperServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.helper.NoticeCommentHelperService", hashSet239);
                        return hashSet239;
                    }
                    break;
                case 657562595:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.count.NoticeCountService")) {
                        HashSet hashSet240 = new HashSet();
                        hashSet240.add(new NoticeCountServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.count.NoticeCountService", hashSet240);
                        return hashSet240;
                    }
                    break;
                case 669378360:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount")) {
                        HashSet hashSet241 = new HashSet();
                        hashSet241.add(new ApiNetworkServiceForAccount());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.framework.services.IApiNetworkServiceForAccount", hashSet241);
                        return hashSet241;
                    }
                    break;
                case 674144051:
                    if (cls.getName().equals("com.ss.android.legoapi.freso.IFrescoLegoTaskApi")) {
                        HashSet hashSet242 = new HashSet();
                        hashSet242.add(new FrescoLegoTaskImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.legoapi.freso.IFrescoLegoTaskApi", hashSet242);
                        return hashSet242;
                    }
                    break;
                case 696264772:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageShareVMService")) {
                        HashSet hashSet243 = new HashSet();
                        hashSet243.add(new StorySidebarOperatorServiceImpl());
                        hashSet243.add(new PoiVideoListDefaultOperatorService());
                        hashSet243.add(new StoryOperatorServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IDetailPageShareVMService", hashSet243);
                        return hashSet243;
                    }
                    break;
                case 698926204:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService")) {
                        HashSet hashSet244 = new HashSet();
                        hashSet244.add(new IRecommendUsersServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersService", hashSet244);
                        return hashSet244;
                    }
                    break;
                case 707572774:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService")) {
                        HashSet hashSet245 = new HashSet();
                        hashSet245.add(new KidsCommonServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.api.common.IKidsCommonService", hashSet245);
                        return hashSet245;
                    }
                    break;
                case 712413375:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IBuildConfigAllService")) {
                        HashSet hashSet246 = new HashSet();
                        hashSet246.add(new BuildConfigAllServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IBuildConfigAllService", hashSet246);
                        return hashSet246;
                    }
                    break;
                case 712436972:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.sticker.IStickerService")) {
                        HashSet hashSet247 = new HashSet();
                        hashSet247.add(new StickerServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.sticker.IStickerService", hashSet247);
                        return hashSet247;
                    }
                    break;
                case 727340201:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.network.INetwork")) {
                        HashSet hashSet248 = new HashSet();
                        hashSet248.add(new NetworkService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.network.INetwork", hashSet248);
                        return hashSet248;
                    }
                    break;
                case 730432555:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IUgAllService")) {
                        HashSet hashSet249 = new HashSet();
                        hashSet249.add(new UgAllServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IUgAllService", hashSet249);
                        return hashSet249;
                    }
                    break;
                case 735010773:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider")) {
                        HashSet hashSet250 = new HashSet();
                        hashSet250.add(new HybridRegistryProvider());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.web.jsbridge.IHybridRegistryProvider", hashSet250);
                        return hashSet250;
                    }
                    break;
                case 736344268:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IDetailPageOperatorService")) {
                        HashSet hashSet251 = new HashSet();
                        hashSet251.add(new ChallengeDetailPageOperatorServiceImpl());
                        hashSet251.add(new ShoppingDetailPageOperatorService());
                        hashSet251.add(new DetailPageOperatorServiceImpl());
                        hashSet251.add(new ProfileDetailPageOperatorServiceImpl());
                        hashSet251.add(new SearchDetailPageOperatorServiceImpl());
                        hashSet251.add(new RecommendFeedDetailPageOperatorServiceImpl());
                        hashSet251.add(new FollowFeedDetailPageOperatorServiceImpl());
                        hashSet251.add(new OftenWatchDetailPageOperatorServiceImpl());
                        hashSet251.add(new FavoriteVideoChatDetailPageOperatorService());
                        hashSet251.add(new MusicDetailPageOperatorServiceImpl());
                        hashSet251.add(new EffectDetailPageOperatorServiceImpl());
                        hashSet251.add(new QuestionDetailPageOperatorServiceImpl());
                        hashSet251.add(new EOYDetailPageOperatorServiceImpl());
                        hashSet251.add(new StoryDefaultOperatorServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IDetailPageOperatorService", hashSet251);
                        return hashSet251;
                    }
                    break;
                case 741106177:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.bl.IBenchmarkService")) {
                        HashSet hashSet252 = new HashSet();
                        hashSet252.add(new BenchmarkServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.bl.IBenchmarkService", hashSet252);
                        return hashSet252;
                    }
                    break;
                case 767497026:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService")) {
                        HashSet hashSet253 = new HashSet();
                        hashSet253.add(new com.ss.android.ugc.aweme.kids.liked.FavoriteServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.liked.api.IFavoriteService", hashSet253);
                        return hashSet253;
                    }
                    break;
                case 797774759:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService")) {
                        HashSet hashSet254 = new HashSet();
                        hashSet254.add(new CommerceCommonServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.service.ICommerceCommonService", hashSet254);
                        return hashSet254;
                    }
                    break;
                case 834678077:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService")) {
                        HashSet hashSet255 = new HashSet();
                        hashSet255.add(new PushLaunchPageAssistantService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.app.services.IPushLaunchPageAssistantService", hashSet255);
                        return hashSet255;
                    }
                    break;
                case 844437951:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.setting.api.ISettingService")) {
                        HashSet hashSet256 = new HashSet();
                        hashSet256.add(new com.ss.android.ugc.aweme.kids.setting.SettingServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.setting.api.ISettingService", hashSet256);
                        return hashSet256;
                    }
                    break;
                case 856538528:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService")) {
                        HashSet hashSet257 = new HashSet();
                        hashSet257.add(new ECommerceLiveSettingsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.influencer.ecommercelive.IECommerceLiveSettingsService", hashSet257);
                        return hashSet257;
                    }
                    break;
                case 864194132:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.IAwemeApplicationService")) {
                        HashSet hashSet258 = new HashSet();
                        hashSet258.add(new AwemeApplicationServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.app.IAwemeApplicationService", hashSet258);
                        return hashSet258;
                    }
                    break;
                case 866935518:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.services.INoticeService")) {
                        HashSet hashSet259 = new HashSet();
                        hashSet259.add(new NoticeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.services.INoticeService", hashSet259);
                        return hashSet259;
                    }
                    break;
                case 895164503:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.services.IRegionService")) {
                        HashSet hashSet260 = new HashSet();
                        hashSet260.add(new RegionService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.app.services.IRegionService", hashSet260);
                        return hashSet260;
                    }
                    break;
                case 897816322:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService")) {
                        HashSet hashSet261 = new HashSet();
                        hashSet261.add(new MSAdaptionService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService", hashSet261);
                        return hashSet261;
                    }
                    break;
                case 905737872:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService")) {
                        HashSet hashSet262 = new HashSet();
                        hashSet262.add(new AdSceneServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService", hashSet262);
                        return hashSet262;
                    }
                    break;
                case 913277804:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.profile.IProfileService")) {
                        HashSet hashSet263 = new HashSet();
                        hashSet263.add(new ProfileServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.profile.IProfileService", hashSet263);
                        return hashSet263;
                    }
                    break;
                case 915813450:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService")) {
                        HashSet hashSet264 = new HashSet();
                        hashSet264.add(new CommerceEggServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService", hashSet264);
                        return hashSet264;
                    }
                    break;
                case 941303398:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.search.ISearchService")) {
                        HashSet hashSet265 = new HashSet();
                        hashSet265.add(new SearchServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.search.ISearchService", hashSet265);
                        return hashSet265;
                    }
                    break;
                case 956329375:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService")) {
                        HashSet hashSet266 = new HashSet();
                        hashSet266.add(new SplashSettingServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.commercialize.splash.setting.ISplashSettingService", hashSet266);
                        return hashSet266;
                    }
                    break;
                case 958565090:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.plugin.service.IPluginService")) {
                        HashSet hashSet267 = new HashSet();
                        hashSet267.add(new AabPluginServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.plugin.service.IPluginService", hashSet267);
                        return hashSet267;
                    }
                    break;
                case 966494283:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService")) {
                        HashSet hashSet268 = new HashSet();
                        hashSet268.add(new ChallengeDetailProviderOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.challenge.service.IChallengeDetailProviderOutService", hashSet268);
                        return hashSet268;
                    }
                    break;
                case 988528279:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAccountHelperService")) {
                        HashSet hashSet269 = new HashSet();
                        hashSet269.add(new AccountHelperService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IAccountHelperService", hashSet269);
                        return hashSet269;
                    }
                    break;
                case 997089185:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IInternalCommerceService")) {
                        HashSet hashSet270 = new HashSet();
                        hashSet270.add(new AVCommerceServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.internal.IInternalCommerceService", hashSet270);
                        return hashSet270;
                    }
                    break;
                case 1000535180:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.stitch.IStitchService")) {
                        HashSet hashSet271 = new HashSet();
                        hashSet271.add(new StitchServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.stitch.IStitchService", hashSet271);
                        return hashSet271;
                    }
                    break;
                case 1018751923:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService")) {
                        HashSet hashSet272 = new HashSet();
                        hashSet272.add(new SplashAdServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService", hashSet272);
                        return hashSet272;
                    }
                    break;
                case 1029031535:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService")) {
                        HashSet hashSet273 = new HashSet();
                        hashSet273.add(new TalentAdRevenueShareServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.profile.talent.ITalentAdRevenueShareService", hashSet273);
                        return hashSet273;
                    }
                    break;
                case 1051676049:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IAVUIUXBugsExperimentService")) {
                        HashSet hashSet274 = new HashSet();
                        hashSet274.add(new AVUIUXBugsExperimentServiceDiff());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.internal.IAVUIUXBugsExperimentService", hashSet274);
                        return hashSet274;
                    }
                    break;
                case 1059333855:
                    if (cls.getName().equals("com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService")) {
                        HashSet hashSet275 = new HashSet();
                        hashSet275.add(new IMCoreDependProxyService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.im.core.api.proxy.IIMCoreDependProxyService", hashSet275);
                        return hashSet275;
                    }
                    break;
                case 1063139064:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService")) {
                        HashSet hashSet276 = new HashSet();
                        hashSet276.add(new ForwardStatisticsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.forward.statistics.IForwardStatisticsService", hashSet276);
                        return hashSet276;
                    }
                    break;
                case 1100609238:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService")) {
                        HashSet hashSet277 = new HashSet();
                        hashSet277.add(new CommerceMediaServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.media.api.service.ICommerceMediaService", hashSet277);
                        return hashSet277;
                    }
                    break;
                case 1109873977:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveHostOuterService")) {
                        HashSet hashSet278 = new HashSet();
                        hashSet278.add(new LiveHostOuterService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.live.ILiveHostOuterService", hashSet278);
                        return hashSet278;
                    }
                    break;
                case 1110040557:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.IIMAdapterService")) {
                        HashSet hashSet279 = new HashSet();
                        hashSet279.add(new IMAdapterServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.im.IIMAdapterService", hashSet279);
                        return hashSet279;
                    }
                    break;
                case 1122426817:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService")) {
                        HashSet hashSet280 = new HashSet();
                        hashSet280.add(new HomepageExperimentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.experiment.IHomepageExperimentService", hashSet280);
                        return hashSet280;
                    }
                    break;
                case 1141291340:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService")) {
                        HashSet hashSet281 = new HashSet();
                        hashSet281.add(new ComplianceSettingsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService", hashSet281);
                        return hashSet281;
                    }
                    break;
                case 1189126425:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.INonPersonalizationService")) {
                        HashSet hashSet282 = new HashSet();
                        hashSet282.add(new NonPersonalizationService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.INonPersonalizationService", hashSet282);
                        return hashSet282;
                    }
                    break;
                case 1205724034:
                    if (cls.getName().equals("com.bytedance.geckox.IGeckoGlobalInit")) {
                        HashSet hashSet283 = new HashSet();
                        hashSet283.add(new GeckoGlobalInitServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.geckox.IGeckoGlobalInit", hashSet283);
                        return hashSet283;
                    }
                    break;
                case 1215087071:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager")) {
                        HashSet hashSet284 = new HashSet();
                        hashSet284.add(new LinkTypeTagsPriorityManagerImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.ILinkTypeTagsPriorityManager", hashSet284);
                        return hashSet284;
                    }
                    break;
                case 1217320995:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IAVSettingService")) {
                        HashSet hashSet285 = new HashSet();
                        hashSet285.add(new IAVSettingServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.port.in.IAVSettingService", hashSet285);
                        return hashSet285;
                    }
                    break;
                case 1229038214:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IAppUpdateService")) {
                        HashSet hashSet286 = new HashSet();
                        hashSet286.add(new AppUpdateService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.services.IAppUpdateService", hashSet286);
                        return hashSet286;
                    }
                    break;
                case 1244392291:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService")) {
                        HashSet hashSet287 = new HashSet();
                        hashSet287.add(new VPAServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService", hashSet287);
                        return hashSet287;
                    }
                    break;
                case 1272240335:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService")) {
                        HashSet hashSet288 = new HashSet();
                        hashSet288.add(new IRecommendUsersDependentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.recommend.users.IRecommendUsersDependentService", hashSet288);
                        return hashSet288;
                    }
                    break;
                case 1291617390:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.question.IQuestionFavoriteService")) {
                        HashSet hashSet289 = new HashSet();
                        hashSet289.add(new QuestionFavoriteServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.question.IQuestionFavoriteService", hashSet289);
                        return hashSet289;
                    }
                    break;
                case 1305629660:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner")) {
                        HashSet hashSet290 = new HashSet();
                        hashSet290.add(new ColdLaunchRequestCombinerImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.requestcombine.IColdLaunchRequestCombiner", hashSet290);
                        return hashSet290;
                    }
                    break;
                case 1311814595:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.turbo.api.brand.ITurboViApi")) {
                        HashSet hashSet291 = new HashSet();
                        hashSet291.add(new TurboViImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.turbo.api.brand.ITurboViApi", hashSet291);
                        return hashSet291;
                    }
                    break;
                case 1315153688:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService")) {
                        HashSet hashSet292 = new HashSet();
                        hashSet292.add(new NotificationCountViewManager.Companion.NotificationCountViewServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.discover.tooltip.NotificationCountViewService", hashSet292);
                        return hashSet292;
                    }
                    break;
                case 1322940111:
                    if (cls.getName().equals("com.ss.android.ugc.musicprovider.MusicPreloaderService")) {
                        HashSet hashSet293 = new HashSet();
                        hashSet293.add(new MusicPreloaderServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.musicprovider.MusicPreloaderService", hashSet293);
                        return hashSet293;
                    }
                    break;
                case 1324297503:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.profile.api.IProfileService")) {
                        HashSet hashSet294 = new HashSet();
                        hashSet294.add(new com.ss.android.ugc.aweme.kids.profile.ProfileServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.profile.api.IProfileService", hashSet294);
                        return hashSet294;
                    }
                    break;
                case 1360758845:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IUserService")) {
                        HashSet hashSet295 = new HashSet();
                        hashSet295.add(new BaseUserService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.framework.services.IUserService", hashSet295);
                        return hashSet295;
                    }
                    break;
                case 1377589410:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.network.IPowerPreload")) {
                        HashSet hashSet296 = new HashSet();
                        hashSet296.add(new PowerPreloadServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.network.IPowerPreload", hashSet296);
                        return hashSet296;
                    }
                    break;
                case 1377752390:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService")) {
                        HashSet hashSet297 = new HashSet();
                        hashSet297.add(new SmartDataTrackerServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.api.ISmartDataTrackerService", hashSet297);
                        return hashSet297;
                    }
                    break;
                case 1382041287:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.trending.service.ITrendingFeedService")) {
                        HashSet hashSet298 = new HashSet();
                        hashSet298.add(new TrendingDetailServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.trending.service.ITrendingFeedService", hashSet298);
                        return hashSet298;
                    }
                    break;
                case 1383321717:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend")) {
                        HashSet hashSet299 = new HashSet();
                        hashSet299.add(new AdTaskDependImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.tasks.IAdTaskDepend", hashSet299);
                        return hashSet299;
                    }
                    break;
                case 1385201501:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.utils.GsonProvider")) {
                        HashSet hashSet300 = new HashSet();
                        hashSet300.add(new GsonHolder());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.utils.GsonProvider", hashSet300);
                        return hashSet300;
                    }
                    break;
                case 1390520786:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggOutService")) {
                        HashSet hashSet301 = new HashSet();
                        hashSet301.add(new CommerceEggOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggOutService", hashSet301);
                        return hashSet301;
                    }
                    break;
                case 1391445989:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.login.ILoginProxy")) {
                        HashSet hashSet302 = new HashSet();
                        hashSet302.add(new LoginProxyImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.login.ILoginProxy", hashSet302);
                        return hashSet302;
                    }
                    break;
                case 1423920585:
                    if (cls.getName().equals("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService")) {
                        HashSet hashSet303 = new HashSet();
                        hashSet303.add(new SplashAdOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdOutService", hashSet303);
                        return hashSet303;
                    }
                    break;
                case 1439372287:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.landpage.IAdLandPageService")) {
                        HashSet hashSet304 = new HashSet();
                        hashSet304.add(new AdLandPageServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.landpage.IAdLandPageService", hashSet304);
                        return hashSet304;
                    }
                    break;
                case 1443402605:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.login.ILoginUtilsService")) {
                        HashSet hashSet305 = new HashSet();
                        hashSet305.add(new LoginUtilsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.login.ILoginUtilsService", hashSet305);
                        return hashSet305;
                    }
                    break;
                case 1453159191:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil")) {
                        HashSet hashSet306 = new HashSet();
                        hashSet306.add(new NoticeLiveWatcherUtilImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.utils.NoticeLiveWatcherUtil", hashSet306);
                        return hashSet306;
                    }
                    break;
                case 1461013736:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.base.ImageUserService")) {
                        HashSet hashSet307 = new HashSet();
                        hashSet307.add(new ImageUserServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.base.ImageUserService", hashSet307);
                        return hashSet307;
                    }
                    break;
                case 1469964205:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService")) {
                        HashSet hashSet308 = new HashSet();
                        hashSet308.add(new GeckoLocalServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.i18n.language.i18n.GeckoLocalService", hashSet308);
                        return hashSet308;
                    }
                    break;
                case 1487002875:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService")) {
                        HashSet hashSet309 = new HashSet();
                        hashSet309.add(new AdsPreviewServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.preview.service.IAdsPreviewService", hashSet309);
                        return hashSet309;
                    }
                    break;
                case 1513354211:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService")) {
                        HashSet hashSet310 = new HashSet();
                        hashSet310.add(new SmartDataCenterApiServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.infra.ISmartDataCenterApiService", hashSet310);
                        return hashSet310;
                    }
                    break;
                case 1520768300:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.hybridkit.IHybridKitService")) {
                        HashSet hashSet311 = new HashSet();
                        hashSet311.add(new HybridKitTaskImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.hybridkit.IHybridKitService", hashSet311);
                        return hashSet311;
                    }
                    break;
                case 1538373766:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory")) {
                        HashSet hashSet312 = new HashSet();
                        hashSet312.add(new MediaChosenResultProcessFactory());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.IMediaChosenResultProcessFactory", hashSet312);
                        return hashSet312;
                    }
                    break;
                case 1543209270:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.ILauncherService")) {
                        HashSet hashSet313 = new HashSet();
                        hashSet313.add(new LauncherServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.launcher.ILauncherService", hashSet313);
                        return hashSet313;
                    }
                    break;
                case 1545114897:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.friends.service.IFollowService")) {
                        HashSet hashSet314 = new HashSet();
                        hashSet314.add(new FollowService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.friends.service.IFollowService", hashSet314);
                        return hashSet314;
                    }
                    break;
                case 1545384024:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService")) {
                        HashSet hashSet315 = new HashSet();
                        hashSet315.add(new SettingsRequestServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.settingsrequest.api.ISettingsRequestService", hashSet315);
                        return hashSet315;
                    }
                    break;
                case 1579750757:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IVideoGiftService")) {
                        HashSet hashSet316 = new HashSet();
                        hashSet316.add(new VideoGiftService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.services.IVideoGiftService", hashSet316);
                        return hashSet316;
                    }
                    break;
                case 1595185874:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.launcher.service.account.IAccountApi")) {
                        HashSet hashSet317 = new HashSet();
                        hashSet317.add(new AccountImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.launcher.service.account.IAccountApi", hashSet317);
                        return hashSet317;
                    }
                    break;
                case 1636333933:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService")) {
                        HashSet hashSet318 = new HashSet();
                        hashSet318.add(new CommerceChallengeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commerce_challenge_api.service.ICommerceChallengeService", hashSet318);
                        return hashSet318;
                    }
                    break;
                case 1648432028:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IMultiAccountService")) {
                        HashSet hashSet319 = new HashSet();
                        hashSet319.add(new MultiAccountService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IMultiAccountService", hashSet319);
                        return hashSet319;
                    }
                    break;
                case 1649339714:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.feed.api.IFeedModuleService")) {
                        HashSet hashSet320 = new HashSet();
                        hashSet320.add(new FeedModuleServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.feed.api.IFeedModuleService", hashSet320);
                        return hashSet320;
                    }
                    break;
                case 1660655893:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService")) {
                        HashSet hashSet321 = new HashSet();
                        hashSet321.add(new ProfileDependentComponentImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService", hashSet321);
                        return hashSet321;
                    }
                    break;
                case 1661968864:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService")) {
                        HashSet hashSet322 = new HashSet();
                        hashSet322.add(new SmartCommonPreloadServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ml.infra.ISmartCommonPreloadService", hashSet322);
                        return hashSet322;
                    }
                    break;
                case 1663726118:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService")) {
                        HashSet hashSet323 = new HashSet();
                        hashSet323.add(new AdLandPagePreloadServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ad.preload.IAdLandPagePreloadService", hashSet323);
                        return hashSet323;
                    }
                    break;
                case 1674227107:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService")) {
                        HashSet hashSet324 = new HashSet();
                        hashSet324.add(new BanAppealServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.banappeal.IBanAppealService", hashSet324);
                        return hashSet324;
                    }
                    break;
                case 1713060419:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService")) {
                        HashSet hashSet325 = new HashSet();
                        hashSet325.add(new PrivacyServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.privacy.IPrivacyService", hashSet325);
                        return hashSet325;
                    }
                    break;
                case 1723717660:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.app.IInitAllService")) {
                        HashSet hashSet326 = new HashSet();
                        hashSet326.add(new InitAllServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.app.IInitAllService", hashSet326);
                        return hashSet326;
                    }
                    break;
                case 1724321674:
                    if (cls.getName().equals("com.ss.android.ugc.gamora.TTEPPageFactory")) {
                        HashSet hashSet327 = new HashSet();
                        hashSet327.add(new TTEPPageFactoryDelegate());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.gamora.TTEPPageFactory", hashSet327);
                        return hashSet327;
                    }
                    break;
                case 1736159254:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IProfileBadgeService")) {
                        HashSet hashSet328 = new HashSet();
                        hashSet328.add(new ProfileBadgeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IProfileBadgeService", hashSet328);
                        return hashSet328;
                    }
                    break;
                case 1739791517:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IChallengeDetailLegacyService")) {
                        HashSet hashSet329 = new HashSet();
                        hashSet329.add(new ChallengeDetailLegacyServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IChallengeDetailLegacyService", hashSet329);
                        return hashSet329;
                    }
                    break;
                case 1765569915:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdOutService")) {
                        HashSet hashSet330 = new HashSet();
                        hashSet330.add(new CommercializeAdOutService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdOutService", hashSet330);
                        return hashSet330;
                    }
                    break;
                case 1766865868:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService")) {
                        HashSet hashSet331 = new HashSet();
                        hashSet331.add(new ShoppingAdsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.e_commerce.service.IShoppingAdsService", hashSet331);
                        return hashSet331;
                    }
                    break;
                case 1771293041:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper")) {
                        HashSet hashSet332 = new HashSet();
                        hashSet332.add(new NotificationClickHelperImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.helper.NotificationClickHelper", hashSet332);
                        return hashSet332;
                    }
                    break;
                case 1772993265:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveOuterService")) {
                        HashSet hashSet333 = new HashSet();
                        hashSet333.add(new LiveOuterService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.live.ILiveOuterService", hashSet333);
                        return hashSet333;
                    }
                    break;
                case 1784620411:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ecommerce.router.view.IFallbackDetector")) {
                        HashSet hashSet334 = new HashSet();
                        hashSet334.add(new FallbackDetector());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ecommerce.router.view.IFallbackDetector", hashSet334);
                        return hashSet334;
                    }
                    break;
                case 1787636921:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService")) {
                        HashSet hashSet335 = new HashSet();
                        hashSet335.add(new PolicyNoticeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService", hashSet335);
                        return hashSet335;
                    }
                    break;
                case 1817711182:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.tools.detail.IMovieReuseService")) {
                        HashSet hashSet336 = new HashSet();
                        hashSet336.add(new MovieReuseServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.tools.detail.IMovieReuseService", hashSet336);
                        return hashSet336;
                    }
                    break;
                case 1832868993:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IRessoAnchorService")) {
                        HashSet hashSet337 = new HashSet();
                        hashSet337.add(new IRessoAnchorServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IRessoAnchorService", hashSet337);
                        return hashSet337;
                    }
                    break;
                case 1839198709:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService")) {
                        HashSet hashSet338 = new HashSet();
                        hashSet338.add(new LiveParasiticModuleLaunchServicePromoteImpl());
                        hashSet338.add(new ILiveParasiticModuleLaunchServiceCommercializeImpl());
                        hashSet338.add(new ILiveParasiticModuleLaunchServiceECImpl());
                        hashSet338.add(new com.ss.android.ugc.aweme.influencer.ecommercelive.framework.serviceimpl.ILiveParasiticModuleLaunchServiceECImpl());
                        hashSet338.add(new LiveBusinessParasiticModule());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.live.ILiveParasiticModuleLaunchService", hashSet338);
                        return hashSet338;
                    }
                    break;
                case 1866297976:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.port.in.IEmojiService")) {
                        HashSet hashSet339 = new HashSet();
                        hashSet339.add(new EmojiServiceImplDiff());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.port.in.IEmojiService", hashSet339);
                        return hashSet339;
                    }
                    break;
                case 1867130512:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService")) {
                        HashSet hashSet340 = new HashSet();
                        hashSet340.add(new ImplService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService", hashSet340);
                        return hashSet340;
                    }
                    break;
                case 1886330729:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.setting.services.IUpdateSettingService")) {
                        HashSet hashSet341 = new HashSet();
                        hashSet341.add(new UpdateSettingServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.setting.services.IUpdateSettingService", hashSet341);
                        return hashSet341;
                    }
                    break;
                case 1893478097:
                    if (cls.getName().equals("com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut")) {
                        HashSet hashSet342 = new HashSet();
                        hashSet342.add(new ProviderConfigOutImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.musicprovider.interfaces.IProviderConfigOut", hashSet342);
                        return hashSet342;
                    }
                    break;
                case 1931560400:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.IAgeGateService")) {
                        HashSet hashSet343 = new HashSet();
                        hashSet343.add(new AgeGateService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.IAgeGateService", hashSet343);
                        return hashSet343;
                    }
                    break;
                case 1932185006:
                    if (cls.getName().equals("com.ss.android.legoapi.ICrashSdkTaskApi")) {
                        HashSet hashSet344 = new HashSet();
                        hashSet344.add(new CrashSdkTaskImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.legoapi.ICrashSdkTaskApi", hashSet344);
                        return hashSet344;
                    }
                    break;
                case 1943814112:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.framework.services.IDeleteAccountService")) {
                        HashSet hashSet345 = new HashSet();
                        hashSet345.add(new DeleteAccountService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.framework.services.IDeleteAccountService", hashSet345);
                        return hashSet345;
                    }
                    break;
                case 1948175614:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService")) {
                        HashSet hashSet346 = new HashSet();
                        hashSet346.add(new ComplianceMonitorServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService", hashSet346);
                        return hashSet346;
                    }
                    break;
                case 1966483646:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.mix.IMixHelperService")) {
                        HashSet hashSet347 = new HashSet();
                        hashSet347.add(new MixHelperService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.mix.IMixHelperService", hashSet347);
                        return hashSet347;
                    }
                    break;
                case 1967964191:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig")) {
                        HashSet hashSet348 = new HashSet();
                        hashSet348.add(new WallpaperGuide1Config());
                        hashSet348.add(new WallpaperGuide2Config());
                        hashSet348.add(new PraiseGuideConfig());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ug.dynamicresource.IDynamicResourceConfig", hashSet348);
                        return hashSet348;
                    }
                    break;
                case 1970320629:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.main.IMainPageService")) {
                        HashSet hashSet349 = new HashSet();
                        hashSet349.add(new MainPageServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.main.IMainPageService", hashSet349);
                        return hashSet349;
                    }
                    break;
                case 1976378617:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory")) {
                        HashSet hashSet350 = new HashSet();
                        hashSet350.add(new PublishServiceFactoryImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.publish.core.publisher.IPublishServiceFactory", hashSet350);
                        return hashSet350;
                    }
                    break;
                case 1985734298:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.kids.compliance.IKidsComplianceService")) {
                        HashSet hashSet351 = new HashSet();
                        hashSet351.add(new KidsComplianceServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.kids.compliance.IKidsComplianceService", hashSet351);
                        return hashSet351;
                    }
                    break;
                case 2019274645:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService")) {
                        HashSet hashSet352 = new HashSet();
                        hashSet352.add(new CommercializeFeedServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.commercialize.service.ICommercializeFeedService", hashSet352);
                        return hashSet352;
                    }
                    break;
                case 2020500036:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.notice.api.helper.WSHelper")) {
                        HashSet hashSet353 = new HashSet();
                        hashSet353.add(new WSHelperImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.notice.api.helper.WSHelper", hashSet353);
                        return hashSet353;
                    }
                    break;
                case 2023609189:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService")) {
                        HashSet hashSet354 = new HashSet();
                        hashSet354.add(new MiniAppDependServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppDependService", hashSet354);
                        return hashSet354;
                    }
                    break;
                case 2037829402:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.IQRCodeService")) {
                        HashSet hashSet355 = new HashSet();
                        hashSet355.add(new QRCodeServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.qrcode.IQRCodeService", hashSet355);
                        return hashSet355;
                    }
                    break;
                case 2046591221:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IBusinessComponentService")) {
                        HashSet hashSet356 = new HashSet();
                        hashSet356.add(new BusinessComponentServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IBusinessComponentService", hashSet356);
                        return hashSet356;
                    }
                    break;
                case 2050400656:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.services.IAVInitializer")) {
                        HashSet hashSet357 = new HashSet();
                        hashSet357.add(new AVInitializerImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.services.IAVInitializer", hashSet357);
                        return hashSet357;
                    }
                    break;
                case 2059590346:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService")) {
                        HashSet hashSet358 = new HashSet();
                        hashSet358.add(new FollowStatisticsServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.follow.statistics.IFollowStatisticsService", hashSet358);
                        return hashSet358;
                    }
                    break;
                case 2070608616:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService")) {
                        HashSet hashSet359 = new HashSet();
                        hashSet359.add(new QrCodeScanImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.qrcode.presenter.QrCodeScanService", hashSet359);
                        return hashSet359;
                    }
                    break;
                case 2075319920:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.comment.ICommentFavoriteService")) {
                        HashSet hashSet360 = new HashSet();
                        hashSet360.add(new CommentFavoriteServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.comment.ICommentFavoriteService", hashSet360);
                        return hashSet360;
                    }
                    break;
                case 2086113417:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.sharer.IChannelApi")) {
                        HashSet hashSet361 = new HashSet();
                        hashSet361.add(new BandChannelService());
                        hashSet361.add(new EmailChannelService());
                        hashSet361.add(new FacebookChannelService());
                        hashSet361.add(new FacebookLiteChannelService());
                        hashSet361.add(new FacebookStoryChannelService());
                        hashSet361.add(new ImgurChannelService());
                        hashSet361.add(new InstagramChannelService());
                        hashSet361.add(new InstagramStoryChannelService());
                        hashSet361.add(new KakaoStoryChannelService());
                        hashSet361.add(new KakaotalkChannelService());
                        hashSet361.add(new LineChannelService());
                        hashSet361.add(new MessengerChannelService());
                        hashSet361.add(new MessengerLiteChannelService());
                        hashSet361.add(new NaverBlogChannelService());
                        hashSet361.add(new NaverCafeChannelService());
                        hashSet361.add(new RedditChannelService());
                        hashSet361.add(new SmsChannelService());
                        hashSet361.add(new SnapchatChannelService());
                        hashSet361.add(new SystemChannelService());
                        hashSet361.add(new TelegramChannelService());
                        hashSet361.add(new TwitterChannelService());
                        hashSet361.add(new ViberChannelService());
                        hashSet361.add(new VkChannelService());
                        hashSet361.add(new WhatsappChannelService());
                        hashSet361.add(new WhatsappStatusChannelService());
                        hashSet361.add(new ZaloChannelService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.sharer.IChannelApi", hashSet361);
                        return hashSet361;
                    }
                    break;
                case 2086698121:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.ICQrcodeService")) {
                        HashSet hashSet362 = new HashSet();
                        hashSet362.add(new CQrcodeService());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.ICQrcodeService", hashSet362);
                        return hashSet362;
                    }
                    break;
                case 2098328820:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService")) {
                        HashSet hashSet363 = new HashSet();
                        hashSet363.add(new HomePageUIFrameServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService", hashSet363);
                        return hashSet363;
                    }
                    break;
                case 2116238537:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.internal.IPrivacyService")) {
                        HashSet hashSet364 = new HashSet();
                        hashSet364.add(new com.ss.android.ugc.aweme.internal.PrivacyServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.internal.IPrivacyService", hashSet364);
                        return hashSet364;
                    }
                    break;
                case 2118728194:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.captcha.util.ICaptchaHelperService")) {
                        HashSet hashSet365 = new HashSet();
                        hashSet365.add(new CaptchaHelperServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.captcha.util.ICaptchaHelperService", hashSet365);
                        return hashSet365;
                    }
                    break;
                case 2128592722:
                    if (cls.getName().equals("com.ss.android.ugc.aweme.donation.IDonationService")) {
                        HashSet hashSet366 = new HashSet();
                        hashSet366.add(new DonationServiceImpl());
                        staticServiceImplManager.invokeAccessputStaticServiceImplSetCache_("com.ss.android.ugc.aweme.donation.IDonationService", hashSet366);
                        return hashSet366;
                    }
                    break;
            }
            staticServiceImplManager.serviceImplSetNotExistSet.add(cls.getName());
            return null;
        }
    }

    private <T> T getStaticServiceImplReal(Class<T> cls) {
        return (T) Partition4.getStaticServiceImplReal(this, cls);
    }

    private <T> Set<T> getStaticServiceImplSetReal(Class<T> cls) {
        return Partition6.getStaticServiceImplSetReal(this, cls);
    }

    public <T> T getStaticServiceImpl(Class<T> cls) {
        String name = cls.getName();
        T t = (T) this.serviceImplCache.get(name);
        return (t != null || this.serviceImplNotExistSet.contains(name)) ? t : (T) getStaticServiceImplReal(cls);
    }

    public <T> Set<T> getStaticServiceImplSet(Class<T> cls) {
        String name = cls.getName();
        Set<T> set = (Set<T>) this.serviceImplSetCache.get(name);
        if (set != null || this.serviceImplSetNotExistSet.contains(name)) {
            return set;
        }
        return getStaticServiceImplSetReal(cls);
    }

    /* access modifiers changed from: private */
    /* renamed from: putStaticServiceImplCache */
    public void invokeAccessputStaticServiceImplCache_(String str, Object obj) {
        this.serviceImplCache.put(str, obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: putStaticServiceImplSetCache */
    public void invokeAccessputStaticServiceImplSetCache_(String str, Set<Object> set) {
        this.serviceImplSetCache.put(str, set);
    }
}
