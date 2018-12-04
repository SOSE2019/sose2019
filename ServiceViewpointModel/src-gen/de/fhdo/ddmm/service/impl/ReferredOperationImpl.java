/**
 */
package de.fhdo.ddmm.service.impl;

import de.fhdo.ddmm.service.Endpoint;
import de.fhdo.ddmm.service.ImportedServiceAspect;
import de.fhdo.ddmm.service.Interface;
import de.fhdo.ddmm.service.Operation;
import de.fhdo.ddmm.service.ProtocolSpecification;
import de.fhdo.ddmm.service.ReferredOperation;
import de.fhdo.ddmm.service.ServicePackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Referred Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.fhdo.ddmm.service.impl.ReferredOperationImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.impl.ReferredOperationImpl#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.impl.ReferredOperationImpl#getProtocols <em>Protocols</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.impl.ReferredOperationImpl#getAspects <em>Aspects</em>}</li>
 *   <li>{@link de.fhdo.ddmm.service.impl.ReferredOperationImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReferredOperationImpl extends MinimalEObjectImpl.Container implements ReferredOperation {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected Operation operation;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected EList<Endpoint> endpoints;

	/**
	 * The cached value of the '{@link #getProtocols() <em>Protocols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocols()
	 * @generated
	 * @ordered
	 */
	protected EList<ProtocolSpecification> protocols;

	/**
	 * The cached value of the '{@link #getAspects() <em>Aspects</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAspects()
	 * @generated
	 * @ordered
	 */
	protected EList<ImportedServiceAspect> aspects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReferredOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePackage.Literals.REFERRED_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOperation() {
		if (operation != null && operation.eIsProxy()) {
			InternalEObject oldOperation = (InternalEObject)operation;
			operation = (Operation)eResolveProxy(oldOperation);
			if (operation != oldOperation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePackage.REFERRED_OPERATION__OPERATION, oldOperation, operation));
			}
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetOperation() {
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperation(Operation newOperation) {
		Operation oldOperation = operation;
		operation = newOperation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REFERRED_OPERATION__OPERATION, oldOperation, operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Endpoint> getEndpoints() {
		if (endpoints == null) {
			endpoints = new EObjectContainmentWithInverseEList<Endpoint>(Endpoint.class, this, ServicePackage.REFERRED_OPERATION__ENDPOINTS, ServicePackage.ENDPOINT__REFERRED_OPERATION);
		}
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProtocolSpecification> getProtocols() {
		if (protocols == null) {
			protocols = new EObjectContainmentEList<ProtocolSpecification>(ProtocolSpecification.class, this, ServicePackage.REFERRED_OPERATION__PROTOCOLS);
		}
		return protocols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImportedServiceAspect> getAspects() {
		if (aspects == null) {
			aspects = new EObjectContainmentWithInverseEList<ImportedServiceAspect>(ImportedServiceAspect.class, this, ServicePackage.REFERRED_OPERATION__ASPECTS, ServicePackage.IMPORTED_SERVICE_ASPECT__REFERRED_OPERATION);
		}
		return aspects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getInterface() {
		if (eContainerFeatureID() != ServicePackage.REFERRED_OPERATION__INTERFACE) return null;
		return (Interface)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetInterface() {
		if (eContainerFeatureID() != ServicePackage.REFERRED_OPERATION__INTERFACE) return null;
		return (Interface)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInterface(Interface newInterface, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newInterface, ServicePackage.REFERRED_OPERATION__INTERFACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterface(Interface newInterface) {
		if (newInterface != eInternalContainer() || (eContainerFeatureID() != ServicePackage.REFERRED_OPERATION__INTERFACE && newInterface != null)) {
			if (EcoreUtil.isAncestor(this, newInterface))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newInterface != null)
				msgs = ((InternalEObject)newInterface).eInverseAdd(this, ServicePackage.INTERFACE__REFERRED_OPERATIONS, Interface.class, msgs);
			msgs = basicSetInterface(newInterface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePackage.REFERRED_OPERATION__INTERFACE, newInterface, newInterface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getQualifiedNameParts() {
		EList<String> _xblockexpression = null;
		{
			if (((this.getOperation().getName() == null) || this.getOperation().getName().isEmpty())) {
				return ECollections.<String>asEList(CollectionLiterals.<String>newArrayList());
			}
			final EList<String> nameParts = this.getInterface().getQualifiedNameParts();
			CollectionExtensions.<String>addAll(nameParts, this.getOperation().getName());
			_xblockexpression = ECollections.<String>asEList(nameParts);
		}
		return _xblockexpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.REFERRED_OPERATION__ENDPOINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndpoints()).basicAdd(otherEnd, msgs);
			case ServicePackage.REFERRED_OPERATION__ASPECTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAspects()).basicAdd(otherEnd, msgs);
			case ServicePackage.REFERRED_OPERATION__INTERFACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetInterface((Interface)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePackage.REFERRED_OPERATION__ENDPOINTS:
				return ((InternalEList<?>)getEndpoints()).basicRemove(otherEnd, msgs);
			case ServicePackage.REFERRED_OPERATION__PROTOCOLS:
				return ((InternalEList<?>)getProtocols()).basicRemove(otherEnd, msgs);
			case ServicePackage.REFERRED_OPERATION__ASPECTS:
				return ((InternalEList<?>)getAspects()).basicRemove(otherEnd, msgs);
			case ServicePackage.REFERRED_OPERATION__INTERFACE:
				return basicSetInterface(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ServicePackage.REFERRED_OPERATION__INTERFACE:
				return eInternalContainer().eInverseRemove(this, ServicePackage.INTERFACE__REFERRED_OPERATIONS, Interface.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePackage.REFERRED_OPERATION__OPERATION:
				if (resolve) return getOperation();
				return basicGetOperation();
			case ServicePackage.REFERRED_OPERATION__ENDPOINTS:
				return getEndpoints();
			case ServicePackage.REFERRED_OPERATION__PROTOCOLS:
				return getProtocols();
			case ServicePackage.REFERRED_OPERATION__ASPECTS:
				return getAspects();
			case ServicePackage.REFERRED_OPERATION__INTERFACE:
				if (resolve) return getInterface();
				return basicGetInterface();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePackage.REFERRED_OPERATION__OPERATION:
				setOperation((Operation)newValue);
				return;
			case ServicePackage.REFERRED_OPERATION__ENDPOINTS:
				getEndpoints().clear();
				getEndpoints().addAll((Collection<? extends Endpoint>)newValue);
				return;
			case ServicePackage.REFERRED_OPERATION__PROTOCOLS:
				getProtocols().clear();
				getProtocols().addAll((Collection<? extends ProtocolSpecification>)newValue);
				return;
			case ServicePackage.REFERRED_OPERATION__ASPECTS:
				getAspects().clear();
				getAspects().addAll((Collection<? extends ImportedServiceAspect>)newValue);
				return;
			case ServicePackage.REFERRED_OPERATION__INTERFACE:
				setInterface((Interface)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicePackage.REFERRED_OPERATION__OPERATION:
				setOperation((Operation)null);
				return;
			case ServicePackage.REFERRED_OPERATION__ENDPOINTS:
				getEndpoints().clear();
				return;
			case ServicePackage.REFERRED_OPERATION__PROTOCOLS:
				getProtocols().clear();
				return;
			case ServicePackage.REFERRED_OPERATION__ASPECTS:
				getAspects().clear();
				return;
			case ServicePackage.REFERRED_OPERATION__INTERFACE:
				setInterface((Interface)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicePackage.REFERRED_OPERATION__OPERATION:
				return operation != null;
			case ServicePackage.REFERRED_OPERATION__ENDPOINTS:
				return endpoints != null && !endpoints.isEmpty();
			case ServicePackage.REFERRED_OPERATION__PROTOCOLS:
				return protocols != null && !protocols.isEmpty();
			case ServicePackage.REFERRED_OPERATION__ASPECTS:
				return aspects != null && !aspects.isEmpty();
			case ServicePackage.REFERRED_OPERATION__INTERFACE:
				return basicGetInterface() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServicePackage.REFERRED_OPERATION___GET_QUALIFIED_NAME_PARTS:
				return getQualifiedNameParts();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReferredOperationImpl
