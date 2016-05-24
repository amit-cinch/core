package com.dotcms.rest.config;

import org.glassfish.jersey.media.multipart.MultiPartFeature;
import com.dotcms.rest.*;
import com.dotcms.rest.api.v1.languages.LanguagesResource;
import com.dotcms.rest.api.v1.personas.PersonaResource;
import com.dotcms.rest.api.v1.sites.ruleengine.rules.actions.ActionResource;
import com.dotcms.rest.api.v1.sites.ruleengine.rules.conditions.ConditionResource;
import com.dotcms.rest.api.v1.sites.ruleengine.rules.conditions.ConditionValueResource;
import com.dotcms.rest.api.v1.sites.ruleengine.rules.conditions.ConditionGroupResource;
import com.dotcms.rest.api.v1.sites.ruleengine.rules.RuleResource;
import com.dotcms.rest.api.v1.system.ruleengine.actionlets.ActionletsResource;
import com.dotcms.rest.api.v1.system.ruleengine.conditionlets.ConditionletsResource;
import com.dotcms.rest.api.v1.system.i18n.I18NResource;
import com.dotcms.rest.api.v1.user.UserResource;
import com.dotcms.rest.personas.PersonasResourcePortlet;
import io.swagger.jaxrs.config.BeanConfig;

import java.util.HashSet;
import java.util.Set;

public class DotRestApplication extends javax.ws.rs.core.Application {
	protected volatile static Set<Class<?>> REST_CLASSES = null;

	public DotRestApplication(){
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setVersion("1.0.2");
		beanConfig.setSchemes(new String[]{"http"});
		beanConfig.setHost("localhost:8080");
		beanConfig.setBasePath("/api");
		beanConfig.setResourcePackage("com.dotcms.rest");
		beanConfig.setScan(true);
		beanConfig.setPrettyPrint(true);
	}

	@Override
	public Set<Class<?>> getClasses() {
		if(REST_CLASSES == null){
			synchronized (this.getClass().getName().intern()) {
				if(REST_CLASSES == null){

					REST_CLASSES = new HashSet<>();
                    REST_CLASSES.add(MultiPartFeature.class);
					REST_CLASSES.add(com.dotcms.rest.ESIndexResource.class);
					REST_CLASSES.add(com.dotcms.rest.RoleResource.class);
					REST_CLASSES.add(com.dotcms.rest.BundleResource.class);
					REST_CLASSES.add(com.dotcms.rest.StructureResource.class);
					REST_CLASSES.add(com.dotcms.rest.ContentResource.class);
					REST_CLASSES.add(com.dotcms.rest.BundlePublisherResource.class);
					REST_CLASSES.add(com.dotcms.rest.JSPPortlet.class);
					REST_CLASSES.add(com.dotcms.rest.AuditPublishingResource.class);
					REST_CLASSES.add(com.dotcms.rest.WidgetResource.class);
					REST_CLASSES.add(com.dotcms.rest.CMSConfigResource.class);
					REST_CLASSES.add(com.dotcms.rest.poc.AngularResourcePortlet.class);
					REST_CLASSES.add(com.dotcms.rest.OSGIResource.class);
					REST_CLASSES.add(com.dotcms.rest.UserResource.class);
					REST_CLASSES.add(com.dotcms.rest.ClusterResource.class);
					REST_CLASSES.add(com.dotcms.rest.EnvironmentResource.class);
					REST_CLASSES.add(com.dotcms.rest.NotificationResource.class);
					REST_CLASSES.add(com.dotcms.rest.IntegrityResource.class);
					REST_CLASSES.add(com.dotcms.rest.LicenseResource.class);
					REST_CLASSES.add(com.dotcms.rest.WorkflowResource.class);

                    REST_CLASSES.add(com.dotcms.rest.RestExamplePortlet.class);
					REST_CLASSES.add(com.dotcms.rest.elasticsearch.ESContentResourcePortlet.class);

					REST_CLASSES.add(PersonaResource.class);
					REST_CLASSES.add(UserResource.class);
					REST_CLASSES.add(TagResource.class);

					REST_CLASSES.add(RulesEnginePortlet.class);
					REST_CLASSES.add(RuleResource.class);
					REST_CLASSES.add(ConditionGroupResource.class);
					REST_CLASSES.add(ConditionResource.class);
					REST_CLASSES.add(ConditionValueResource.class);
					REST_CLASSES.add(PersonasResourcePortlet.class);


					REST_CLASSES.add(ConditionletsResource.class);
					REST_CLASSES.add(ActionResource.class);
					REST_CLASSES.add(ActionletsResource.class);
					REST_CLASSES.add(I18NResource.class);
					REST_CLASSES.add(LanguagesResource.class);

					REST_CLASSES.add(MenuResource.class);

					REST_CLASSES.add(io.swagger.jaxrs.listing.SwaggerSerializers.class);
					REST_CLASSES.add(io.swagger.jaxrs.listing.ApiListingResource.class);

					REST_CLASSES.add(SimpleTestResource.class);

				}
			}
		}
		return REST_CLASSES;

	}

}