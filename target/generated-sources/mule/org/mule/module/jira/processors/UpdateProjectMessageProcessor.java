
package org.mule.module.jira.processors;

import com.atlassian.jira.rpc.soap.beans.RemoteProject;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleException;
import org.mule.api.config.ConfigurationException;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.lifecycle.InitialisationException;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.registry.RegistrationException;
import org.mule.common.DefaultResult;
import org.mule.common.FailureType;
import org.mule.common.Result;
import org.mule.common.metadata.ConnectorMetaDataEnabled;
import org.mule.common.metadata.DefaultMetaData;
import org.mule.common.metadata.DefaultPojoMetaDataModel;
import org.mule.common.metadata.DefaultSimpleMetaDataModel;
import org.mule.common.metadata.MetaData;
import org.mule.common.metadata.MetaDataKey;
import org.mule.common.metadata.MetaDataModel;
import org.mule.common.metadata.OperationMetaDataEnabled;
import org.mule.common.metadata.datatype.DataType;
import org.mule.common.metadata.datatype.DataTypeFactory;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;
import org.mule.module.jira.JiraConnector;
import org.mule.module.jira.JiraConnectorException;
import org.mule.security.oauth.callback.ProcessCallback;


/**
 * UpdateProjectMessageProcessor invokes the {@link org.mule.module.jira.JiraConnector#updateProject(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)} method in {@link JiraConnector }. For each argument there is a field in this processor to match it.  Before invoking the actual method the processor will evaluate and transform where possible to the expected argument type.
 * 
 */
@SuppressWarnings("all")
@Generated(value = "Mule DevKit Version 3.7.1", date = "2015-10-14T02:51:30-03:00", comments = "Build UNNAMED.2613.77421cc")
public class UpdateProjectMessageProcessor
    extends DevkitBasedMessageProcessor
    implements MessageProcessor, OperationMetaDataEnabled
{

    protected Object key;
    protected String _keyType;
    protected Object projectName;
    protected String _projectNameType;
    protected Object description;
    protected String _descriptionType;
    protected Object url;
    protected String _urlType;
    protected Object lead;
    protected String _leadType;
    protected Object permissionSchemeName;
    protected String _permissionSchemeNameType;
    protected Object notificationSchemeName;
    protected String _notificationSchemeNameType;
    protected Object securityShemeName;
    protected String _securityShemeNameType;

    public UpdateProjectMessageProcessor(String operationName) {
        super(operationName);
    }

    /**
     * Obtains the expression manager from the Mule context and initialises the connector. If a target object  has not been set already it will search the Mule registry for a default one.
     * 
     * @throws InitialisationException
     */
    public void initialise()
        throws InitialisationException
    {
    }

    @Override
    public void start()
        throws MuleException
    {
        super.start();
    }

    @Override
    public void stop()
        throws MuleException
    {
        super.stop();
    }

    @Override
    public void dispose() {
        super.dispose();
    }

    /**
     * Sets permissionSchemeName
     * 
     * @param value Value to set
     */
    public void setPermissionSchemeName(Object value) {
        this.permissionSchemeName = value;
    }

    /**
     * Sets description
     * 
     * @param value Value to set
     */
    public void setDescription(Object value) {
        this.description = value;
    }

    /**
     * Sets notificationSchemeName
     * 
     * @param value Value to set
     */
    public void setNotificationSchemeName(Object value) {
        this.notificationSchemeName = value;
    }

    /**
     * Sets lead
     * 
     * @param value Value to set
     */
    public void setLead(Object value) {
        this.lead = value;
    }

    /**
     * Sets projectName
     * 
     * @param value Value to set
     */
    public void setProjectName(Object value) {
        this.projectName = value;
    }

    /**
     * Sets url
     * 
     * @param value Value to set
     */
    public void setUrl(Object value) {
        this.url = value;
    }

    /**
     * Sets key
     * 
     * @param value Value to set
     */
    public void setKey(Object value) {
        this.key = value;
    }

    /**
     * Sets securityShemeName
     * 
     * @param value Value to set
     */
    public void setSecurityShemeName(Object value) {
        this.securityShemeName = value;
    }

    /**
     * Invokes the MessageProcessor.
     * 
     * @param event MuleEvent to be processed
     * @throws Exception
     */
    public MuleEvent doProcess(final MuleEvent event)
        throws Exception
    {
        Object moduleObject = null;
        try {
            moduleObject = findOrCreate(null, false, event);
            final String _transformedKey = ((String) evaluateAndTransform(getMuleContext(), event, UpdateProjectMessageProcessor.class.getDeclaredField("_keyType").getGenericType(), null, key));
            final String _transformedProjectName = ((String) evaluateAndTransform(getMuleContext(), event, UpdateProjectMessageProcessor.class.getDeclaredField("_projectNameType").getGenericType(), null, projectName));
            final String _transformedDescription = ((String) evaluateAndTransform(getMuleContext(), event, UpdateProjectMessageProcessor.class.getDeclaredField("_descriptionType").getGenericType(), null, description));
            final String _transformedUrl = ((String) evaluateAndTransform(getMuleContext(), event, UpdateProjectMessageProcessor.class.getDeclaredField("_urlType").getGenericType(), null, url));
            final String _transformedLead = ((String) evaluateAndTransform(getMuleContext(), event, UpdateProjectMessageProcessor.class.getDeclaredField("_leadType").getGenericType(), null, lead));
            final String _transformedPermissionSchemeName = ((String) evaluateAndTransform(getMuleContext(), event, UpdateProjectMessageProcessor.class.getDeclaredField("_permissionSchemeNameType").getGenericType(), null, permissionSchemeName));
            final String _transformedNotificationSchemeName = ((String) evaluateAndTransform(getMuleContext(), event, UpdateProjectMessageProcessor.class.getDeclaredField("_notificationSchemeNameType").getGenericType(), null, notificationSchemeName));
            final String _transformedSecurityShemeName = ((String) evaluateAndTransform(getMuleContext(), event, UpdateProjectMessageProcessor.class.getDeclaredField("_securityShemeNameType").getGenericType(), null, securityShemeName));
            Object resultPayload;
            final ProcessTemplate<Object, Object> processTemplate = ((ProcessAdapter<Object> ) moduleObject).getProcessTemplate();
            resultPayload = processTemplate.execute(new ProcessCallback<Object,Object>() {


                public List<Class<? extends Exception>> getManagedExceptions() {
                    return Arrays.asList(((Class<? extends Exception> []) new Class[] {JiraConnectorException.class }));
                }

                public boolean isProtected() {
                    return false;
                }

                public Object process(Object object)
                    throws Exception
                {
                    return ((JiraConnector) object).updateProject(_transformedKey, _transformedProjectName, _transformedDescription, _transformedUrl, _transformedLead, _transformedPermissionSchemeName, _transformedNotificationSchemeName, _transformedSecurityShemeName);
                }

            }
            , this, event);
            event.getMessage().setPayload(resultPayload);
            return event;
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Result<MetaData> getInputMetaData() {
        return new DefaultResult<MetaData>(null, (Result.Status.SUCCESS));
    }

    @Override
    public Result<MetaData> getOutputMetaData(MetaData inputMetadata) {
        return new DefaultResult<MetaData>(new DefaultMetaData(getPojoOrSimpleModel(RemoteProject.class)));
    }

    private MetaDataModel getPojoOrSimpleModel(Class clazz) {
        DataType dataType = DataTypeFactory.getInstance().getDataType(clazz);
        if (DataType.POJO.equals(dataType)) {
            return new DefaultPojoMetaDataModel(clazz);
        } else {
            return new DefaultSimpleMetaDataModel(dataType);
        }
    }

    public Result<MetaData> getGenericMetaData(MetaDataKey metaDataKey) {
        ConnectorMetaDataEnabled connector;
        try {
            connector = ((ConnectorMetaDataEnabled) findOrCreate(null, false, null));
            try {
                Result<MetaData> metadata = connector.getMetaData(metaDataKey);
                if ((Result.Status.FAILURE).equals(metadata.getStatus())) {
                    return metadata;
                }
                if (metadata.get() == null) {
                    return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error processing metadata at JiraConnector at updateProject retrieving was successful but result is null");
                }
                return metadata;
            } catch (Exception e) {
                return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
            }
        } catch (ClassCastException cast) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), "There was an error getting metadata, there was no connection manager available. Maybe you're trying to use metadata from an Oauth connector");
        } catch (ConfigurationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (RegistrationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (IllegalAccessException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (InstantiationException e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        } catch (Exception e) {
            return new DefaultResult<MetaData>(null, (Result.Status.FAILURE), e.getMessage(), FailureType.UNSPECIFIED, e);
        }
    }

}