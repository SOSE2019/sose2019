/**
 * generated by Xtext 2.12.0
 */
package de.fhdo.ddmm;

import de.fhdo.ddmm.AbstractServiceDslRuntimeModule;
import de.fhdo.ddmm.ServiceDslQualifiedNameProvider;
import de.fhdo.ddmm.ServiceDslResourceDescriptionStrategy;
import de.fhdo.ddmm.scoping.ServiceDslScopeProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.scoping.IScopeProvider;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension
 * registry.
 */
@SuppressWarnings("all")
public class ServiceDslRuntimeModule extends AbstractServiceDslRuntimeModule {
  /**
   * Bind custom scope provider
   */
  @Override
  public Class<? extends IScopeProvider> bindIScopeProvider() {
    return ServiceDslScopeProvider.class;
  }
  
  /**
   * Bind custom qualified name provider
   */
  @Override
  public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
    return ServiceDslQualifiedNameProvider.class;
  }
  
  /**
   * Bind custom resource description strategy
   */
  public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
    return ServiceDslResourceDescriptionStrategy.class;
  }
}
