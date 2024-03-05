/*
 * 
 */
package concreta.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

import concreta.Aggregation;
import concreta.Classba;
import concreta.DiagramClassba;
import concreta.diagram.edit.policies.ConcretaBaseItemSemanticEditPolicy;

/**
 * @generated
 */
public class AggregationReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public AggregationReorientCommand(ReorientRelationshipRequest request) {
		super(request.getLabel(), request.getRelationship(), request);
		reorientDirection = request.getDirection();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == getElementToEdit() instanceof Aggregation) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof Classba && newEnd instanceof Classba)) {
			return false;
		}
		Classba target = getLink().getTarget();
		if (!(getLink().eContainer() instanceof DiagramClassba)) {
			return false;
		}
		DiagramClassba container = (DiagramClassba) getLink().eContainer();
		return ConcretaBaseItemSemanticEditPolicy.getLinkConstraints().canExistAggregation_4002(container, getLink(),
				getNewSource(), target);
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof Classba && newEnd instanceof Classba)) {
			return false;
		}
		Classba source = getLink().getSource();
		if (!(getLink().eContainer() instanceof DiagramClassba)) {
			return false;
		}
		DiagramClassba container = (DiagramClassba) getLink().eContainer();
		return ConcretaBaseItemSemanticEditPolicy.getLinkConstraints().canExistAggregation_4002(container, getLink(),
				source, getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getLink().setSource(getNewSource());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getLink().setTarget(getNewTarget());
		return CommandResult.newOKCommandResult(getLink());
	}

	/**
	* @generated
	*/
	protected Aggregation getLink() {
		return (Aggregation) getElementToEdit();
	}

	/**
	* @generated
	*/
	protected Classba getOldSource() {
		return (Classba) oldEnd;
	}

	/**
	* @generated
	*/
	protected Classba getNewSource() {
		return (Classba) newEnd;
	}

	/**
	* @generated
	*/
	protected Classba getOldTarget() {
		return (Classba) oldEnd;
	}

	/**
	* @generated
	*/
	protected Classba getNewTarget() {
		return (Classba) newEnd;
	}
}
